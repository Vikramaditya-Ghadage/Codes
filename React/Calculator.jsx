import React, { useState } from 'react';

function App() {
  const [ans, setAnswer] = useState(0);
  const [value, setValue] = useState(0);  // Number state
  
  const addNo = () => {
    setAnswer(ans + Number(value));  // Convert to number
  };
  
  const multiplyNo = () => {
    setAnswer(ans * Number(value));
  };

  const handleInputChange = (e) => {
    setValue(Number(e.target.value) || 0);  // Convert + default 0
  };

  return (
    <div>
      <h2>Answer is: {ans}</h2>
      
      Input:
      {/* CONTROLLED: Add value + type="number" */}
      <input 
        type="number" 
        value={value}
        onChange={handleInputChange}
      />
      
      <button onClick={addNo}>Add</button>
      <button onClick={multiplyNo}>Multiply</button>  {/* Fixed text */}
      
      <button onClick={() => setAnswer(0)}>Reset</button>
    </div>
  );
}

export default App;
