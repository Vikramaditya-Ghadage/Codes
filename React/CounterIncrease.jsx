import React, {useState} from 'react';

function App()
{
  const [counter,setCounter]=useState(1);
  
  return(
      <div>
        <h2>Counter is: {counter} </h2>
        
        <button style={{color:"red"}}onClick={() => setCounter(counter + 1)}>
        Increment Counter
      </button>
        
      </div>
    );
}

export default App