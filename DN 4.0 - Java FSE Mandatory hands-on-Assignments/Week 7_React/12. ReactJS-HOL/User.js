import React from 'react';
function User({ onLogout }) {
  return (
    <div>
      <h1>Welcome back</h1>
      <button onClick={onLogout}>Logout</button>
    </div>
  );
}
export default User;
