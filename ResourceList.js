// Component to display a list of resources
import React, { useState, useEffect } from 'react';
import axios from 'axios';
import { Link } from 'react-router-dom';

const ResourceList = () => {
    // State to hold the list of resources
    const [resources, setResources] = useState([]);

    // Fetch resources on component mount
    useEffect(() => {
        axios.get('/api/resources')
            .then(response => setResources(response.data))
            .catch(error => console.error(error));
    }, []);

    return (
        <div>
            <h1>Resources List</h1>
            <ul>
                {/* Iterate over resources and display each */}
                {resources.map(resource => (
                    <li key={resource.id}>{resource.name} - {resource.type} - {resource.quantity}</li>
                ))}
            </ul>
            {/* Link to navigate to add resource form */}
            <Link to="/add">Add Resource</Link>
        </div>
    );
};

export default ResourceList;