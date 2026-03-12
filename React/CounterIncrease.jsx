import React, { useState } from 'react';

function App() {
  const [cnt, setCnt] = useState(0);  // Fixed: useState returns [state, setter]
  
  return (
    <div>
      <p style={{ color: "red", fontWeight: "bold" }}>Counter is:{cnt}</p>  {/* Bold red text */}
      <button 
        style={{ 
          color: "red", 
          fontWeight: "bold", 
          backgroundColor: "lightblue",  // Added for button visibility
          padding: "10px 20px",
          fontSize: '20px',
          border: "none",
          borderRadius: "5px",
          cursor: "pointer"
        }}
        onClick={() => setCnt(cnt + 1)}  // Fixed: setCnt, corrected spelling
      >
        Increase Counter  {/* Fixed typo: "Increate" -> "Increase" */}
      </button>
    </div>
  );
}

export default App;
