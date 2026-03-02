import React, { createContext, useContext, useRef, useLayoutEffect, useMemo, useCallback, useEffect, useState, useReducer } from 'react';

// Reducer for operations state
const opsReducer = (state, action) => {
  switch (action.type) {
    case 'SET_NUM': return { ...state, num: action.payload };
    case 'CALC_FACT': return { ...state, result: factorial(state.num), lastOp: 'factorial' };
    case 'CHECK_EVEN_ODD': return { ...state, result: state.num % 2 === 0 ? 'Even' : 'Odd', lastOp: 'even/odd' };
    default: return state;
  }
};

function factorial(n) {
  if (n <= 1) return 1;
  let res = 1;
  for (let i = 2; i <= n; i++) res *= i;
  return res;
}

// Theme Context (shared via useContext)
const ThemeContext = createContext({ theme: 'light', setTheme: () => {} });

function App() {
  const [theme, setTheme] = useState('light'); // useState for app state
  
  // useReducer for complex ops logic
  const [state, dispatch] = useReducer(opsReducer, { num: 5, result: 120, lastOp: 'factorial' });
  
  return (
    <ThemeContext.Provider value={{ theme, setTheme }}>
      <div style={{ padding: '20px', background: theme === 'dark' ? '#333' : '#fff', color: theme === 'dark' ? '#fff' : '#000' }}>
        <h1>Math Hooks Calculator</h1>
        <Calculator {...state} dispatch={dispatch} />
        <ThemeToggle />
      </div>
    </ThemeContext.Provider>
  );
}

// Main calculator component
function Calculator({ num, result, lastOp, dispatch }) {
  const inputRef = useRef(null); // useRef for focusing input
  const historyRef = useRef([]);  // Mutable history array
  
  // useContext for theme
  const { theme } = useContext(ThemeContext);
  
  // useMemo: Expensive factorial (memoized)
  const memoizedFact = useMemo(() => factorial(num), [num]);
  
  // useCallback: Stable event handlers
  const handleCalcFact = useCallback(() => {
    dispatch({ type: 'CALC_FACT' });
  }, []);
  
  const handleCheckEvenOdd = useCallback(() => {
    dispatch({ type: 'CHECK_EVEN_ODD' });
  }, []);
  
  // useEffect: Side effect on num change (log history)
  useEffect(() => {
    historyRef.current.push({ num, result, lastOp });
    console.log('History updated:', historyRef.current.slice(-3)); // Last 3 ops
  }, [num, result, lastOp]);
  
  // useLayoutEffect: Sync measurement after layout (e.g., input width)
  useLayoutEffect(() => {
    if (inputRef.current) {
      const width = inputRef.current.getBoundingClientRect().width;
      console.log(`Input width: ${width}px (measured sync)`);
    }
  }, [num]);
  
  return (
    <div style={{ margin: '20px 0' }}>
      <input
        ref={inputRef}
        type="number"
        value={num}
        onChange={(e) => dispatch({ type: 'SET_NUM', payload: +e.target.value })}
        style={{ padding: '10px', marginRight: '10px' }}
      />
      <button onClick={handleCalcFact} style={{ padding: '10px', marginRight: '10px' }}>Factorial</button>
      <button onClick={handleCheckEvenOdd} style={{ padding: '10px' }}>Even/Odd</button>
      <div style={{ marginTop: '20px', fontSize: '24px' }}>
        Result: {result} ({lastOp}) | Memoized Fact: {memoizedFact}
      </div>
      <div>History length: {historyRef.current.length}</div>
    </div>
  );
}

const ThemeToggle = () => {
  const { theme, setTheme } = useContext(ThemeContext);
  return (
    <button onClick={() => setTheme(theme === 'light' ? 'dark' : 'light')}>
      Toggle {theme === 'light' ? 'Dark' : 'Light'} Theme
    </button>
  );
};

export default App;
