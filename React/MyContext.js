import React, { createContext, useContext, useState } from 'react';

// Create Context
const MyContext = createContext();

// Provider Component
const MyProvider = ({ children }) => {
  const [someData, setSomeData] = useState('Hello, World!');
  const value = { someData, setSomeData };

  return (
    <MyContext.Provider value={value}>
      {children}
    </MyContext.Provider>
  );
};

// Consume Context
const MyComponent = () => {
  const { someData } = useContext(MyContext);
  return <div>{someData}</div>;
};

// App Component
const App = () => {
  return (
    <MyProvider>
      <MyComponent />
    </MyProvider>
  );
};

export default App;
