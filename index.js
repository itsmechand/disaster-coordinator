// Entry point of the React application
import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css'; // Correct import of CSS file
import App from './App';
import reportWebVitals from './reportWebVitals';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);

// Report web vitals for performance monitoring
reportWebVitals();