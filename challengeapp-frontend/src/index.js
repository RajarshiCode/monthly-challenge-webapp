import React from 'react';
import ReactDOM from 'react-dom/client'; // client api which is used for rendering react components to the DOM(Document Object Model)
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);


reportWebVitals();
