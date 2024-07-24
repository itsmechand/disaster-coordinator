// Component to add a new resource via a form
import React, { useState } from 'react';
import axios from 'axios';
import { useNavigate } from 'react-router-dom';

const ResourceForm = () => {
    // State to hold form input values
    const [resource, setResource] = useState({ name: '', type: '', quantity: 0 });
    const navigate = useNavigate();

    // Handle input changes and update state
    const handleInputChange = (e) => {
        const { name, value } = e.target;
        setResource({ ...resource, [name]: value });
    };

    // Handle form submission
    const handleSubmit = (e) => {
        e.preventDefault();
        axios.post('/api/resources', resource)
            .then(() => navigate('/'))
            .catch(error => console.error(error));
    };

    return (
        <form onSubmit={handleSubmit}>
            {/* Input for resource name */}
            <div>
                <label>
                    Name:
                    <input type="text" name="name" value={resource.name} onChange={handleInputChange} />
                </label>
            </div>
            {/* Input for resource type */}
            <div>
                <label>
                    Type:
                    <input type="text" name="type" value={resource.type} onChange={handleInputChange} />
                </label>
            </div>
            {/* Input for resource quantity */}
            <div>
                <label>
                    Quantity:
                    <input type="number" name="quantity" value={resource.quantity} onChange={handleInputChange} />
                </label>
            </div>
            {/* Submit button */}
            <button type="submit">Add Resource</button>
        </form>
    );
};

export default ResourceForm;