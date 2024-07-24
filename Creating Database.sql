CREATE DATABASE disaster_coordinator;

CREATE USER disaster_user WITH ENCRYPTED PASSWORD 'Chandra#20003';
GRANT ALL PRIVILEGES ON DATABASE disaster_coordinator TO disaster_user;