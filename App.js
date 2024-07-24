// Main application component setting up routing
import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import ResourceList from './components/ResourceList';
import ResourceForm from './components/ResourceForm';

const App = () => {
    return (
        <Router>
            <div>
                <Routes>
                    {/* Route for resource list view */}
                    <Route path="/" element={<ResourceList />} />
                    {/* Route for adding a new resource */}
                    <Route path="/add" element={<ResourceForm />} />
                </Routes>
            </div>
        </Router>
    );
};

export default App;