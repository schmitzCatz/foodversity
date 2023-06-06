# Foodversity

## Development

Foodversity has 3 distinct profiles, Development, Production and Test.
As per default the Development profile is active. To change that behaviour 
start the application with the desired profile either by setting the enviroment variable:

``export spring_profiles_active=test``

Or by passing the system property as a startup parameter:

``-Dspring.profiles.active=test``