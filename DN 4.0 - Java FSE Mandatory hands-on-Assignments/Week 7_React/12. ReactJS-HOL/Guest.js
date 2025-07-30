import React from 'react';

function Guest({ onLogin }) {
  return (
    <div>
      <h1>Please sign up.</h1>
      <button onClick={onLogin}>Login</button>
    </div>
  );
}
export default Guest;
