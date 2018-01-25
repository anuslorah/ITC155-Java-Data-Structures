Assignment 1: Movies
Absolute Java, 6th ed, p. 519, Programming Projects 2 & 3 

Create a class named Movie that can be used with your video rental business.

The Movie class should track the Motion Picture Association of America (MPAA) rating (e.g., Rated G, PG-13, R), ID Number, and movie title with appropriate accessor and mutator methods.

Next, create three additional classes named Action, Comedy, and Drama that are derived from Movie.

Finally, create an overridden method named calculateLateFees that takes as input the number of days a movie is late and returns the late fee for that movie.

The default late fee is $2/day. Action movies have a late fee of $3/day, comedies are $2.50/day, and dramas are $2/day. Test your classes from a main method.


Extend the previous problem with a Rental class. This class should store a Movie that is rented, an integer representing the ID of the customer that rented the movie, and an integer indicating how many days late the movie is.

Add a method that calculates the late fees for the rental. In your main method, create an array of type Rental filled with sample data of all types of movies.

Then, create a method named lateFeesOwed that iterates through the array and returns the total amount of late fees that are outstanding.
