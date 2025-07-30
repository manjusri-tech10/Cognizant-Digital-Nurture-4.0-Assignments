import React, { useState } from 'react';
import Guest from './Guest';
import User from './User';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => setIsLoggedIn(true);
  const handleLogout = () => setIsLoggedIn(false);

  return (
    <div style={{ textAlign: 'center', marginTop: '100px' }}>
      {isLoggedIn ? (
        <User onLogout={handleLogout} />
      ) : (
        <Guest onLogin={handleLogin} />
      )}
    </div>
  );
}

export default App;
