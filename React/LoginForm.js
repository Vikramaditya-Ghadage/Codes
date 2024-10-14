import React, { useState } from 'react';

function Login() {
  // State for form input fields and authentication status
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [isLoggedIn, setIsLoggedIn] = useState(false);
  const [error, setError] = useState('');

  // Mock user data for authentication
  const mockUser = {
    email: 'user@example.com',
    password: 'password123',
  };

  // Handle form submission (login logic)
  const handleSubmit = (e) => {
    e.preventDefault(); // Prevent form reload
    // Basic mock authentication logic
    if (email === mockUser.email && password === mockUser.password) {
      setIsLoggedIn(true); // Set the login status
      setError(''); // Clear error
    } else {
      setError('Invalid email or password!'); // Show error on failure
    }
  };

  // Handle logout
  const handleLogout = () => {
    setIsLoggedIn(false); // Set the login status to false
    setEmail(''); // Reset email field
    setPassword(''); // Reset password field
  };

  return (
    <div>
      {isLoggedIn ? (
        <div>
          <h2>Welcome, {email}!</h2>
          <button onClick={handleLogout}>Logout</button>
        </div>
      ) : (
        <div>
          <h2>Login</h2>
          <form onSubmit={handleSubmit}>
            <div>
              <label>Email: </label>
              <input
                type="email"
                value={email}
                onChange={(e) => setEmail(e.target.value)}
              />
            </div>
            <div>
              <label>Password: </label>
              <input
                type="password"
                value={password}
                onChange={(e) => setPassword(e.target.value)}
              />
            </div>
            {error && <p style={{ color: 'red' }}>{error}</p>}
            <button type="submit">Login</button>
          </form>
        </div>
      )}
    </div>
  );
}

export default Login;
