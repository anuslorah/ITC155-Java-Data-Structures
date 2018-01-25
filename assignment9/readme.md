p.946/ex. 8

8. You have collected a file of movie ratings where each movie is rated from 1 (bad) to 5 (excellent).  The first line of the file is a number that identifies how many ratings are in the file.  Each rating then consists of two lines: the name of the movie followed by the numeric rating from 1 to 5.  Here is a sample rating file with four unique movies and seven ratings:

7
Harry Potter and the Half-Blood Prince
4
Harry Potter and the Half-Blood Prince
5
Army of the Dead
1
Harry Potter and the Half-Blood Prince
4
Army of the Dead
2
The Uninvited
4
Pandorium
3

Write a program that reads a file in this format, calculates the average rating for each movie, and outputs the average along with the number of reviews.  Here is the desired output for the sample data:

Harry Potter and the Half-Blood Prince: 3 reviews, average of 4.3 / 5
Army of the Dead: 2 reviews, average of 1.5 / 5
The Uninvited: 1 review, average of 4 / 5
Pandorium: 1 review, average of 3 / 5

Use a HashMap or multiple HashMaps to calculate the output.  Your map(s) should index from a string representing each movie’s name to integers that store the number of reviews for the movie and the sum of the ratings for the movie.

Hints:
1.	The file, ratings.txt is located in Week 9 module, or here.
The file needs to be saved in your Project folder — this is what Eclipse considers the current directory (not in the src folder).
2.	You should use a Scanner to read the file.
FileInputStream inputStream
    = new FileInputStream("ratings.txt");
Scanner fileScanner = new Scanner(inputStream);
3.	Create a RatingStats class with the following instance variables:
private int ratingsCount;
private double ratingsSum;
4.	The RatingStats class will be used as the value.
// The ratings HashMap maps from a movie name
// to a RatingStats object.
HashMap<String, RatingStats> ratings = new HashMap<>();
5.	You can iterate over the HashMap using the map’s keys.
// Iterate through the HashMap
// and output the average for each movie.
Set<String> movies = ratings.keySet();
for (String movie : movies)
{
    // Add code here.
}

