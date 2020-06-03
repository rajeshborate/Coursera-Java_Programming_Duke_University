# Programming Exercise: Parsing Weather Data

## Assignment

You will write a program to find the coldest day of the year and other interesting facts about the temperature and humidity in a day. To test your program, you will use the nc_weather data folder that has a folder for each year; you can download a .zip folder with these files by clicking here. In the year folder there is a CSV file for every day of the year; each file has the following information. For example, in the 2014 folder, we show parts of the file weather-2014-01-08.csv, the weather data from January 8, 2014.


You will write a program with several methods and tester methods to test each method you write. You should start with the methods from the lesson to find the hottest temperature in a day (and thus in a file) and the hottest temperature in many files and their tester methods. You can use these to write similar methods to find the coldest temperatures.

Specifically you should write the following methods.

1. Write a method named coldestHourInFile that has one parameter, a CSVParser named parser. This method returns the CSVRecord with the coldest temperature in the file and thus all the information about the coldest temperature, such as the hour of the coldest temperature. You should also write a void method named testColdestHourInFile() to test this method and print out information about that coldest temperature, such as the time of its occurrence.

NOTE: Sometimes there was not a valid reading at a specific hour, so the temperature field says -9999. You should ignore these bogus temperature values when calculating the lowest temperature.

2. Write the method fileWithColdestTemperature that has no parameters. This method should return a string that is the name of the file from selected files that has the coldest temperature. You should also write a void method named testFileWithColdestTemperature() to test this method. Note that after determining the filename, you could call the method coldestHourInFile to determine the coldest temperature on that day. When fileWithColdestTemperature runs and selects the files for January 1–3 in 2014, the method should print out


3. Write a method named lowestHumidityInFile that has one parameter, a CSVParser named parser. This method returns the CSVRecord that has the lowest humidity. If there is a tie, then return the first such record that was found.

Note that sometimes there is not a number in the Humidity column but instead there is the string “N/A”. This only happens very rarely. You should check to make sure the value you get is not “N/A” before converting it to a number.

Also note that the header for the time is either TimeEST or TimeEDT, depending on the time of year. You will instead use the DateUTC field at the right end of the data file to get both the date and time of a temperature reading.

You should also write a void method named testLowestHumidityInFile() to test this method that starts with these lines:


and then prints the lowest humidity AND the time the lowest humidity occurred. For example, for the file weather-2014-01-20.csv, the output should be:


NOTE: If you look at the data for January 20, 2014, you will note that the Humidity was also 24 at 3:51pm, but you are supposed to return the first such record that was found.

4. Write the method lowestHumidityInManyFiles that has no parameters. This method returns a CSVRecord that has the lowest humidity over all the files. If there is a tie, then return the first such record that was found. You should also write a void method named testLowestHumidityInManyFiles() to test this method and to print the lowest humidity AND the time the lowest humidity occurred. Be sure to test this method on two files so you can check if it is working correctly. If you run this program and select the files for January 19, 2014 and January 20, 2014, you should get


5. Write the method averageTemperatureInFile that has one parameter, a CSVParser named parser. This method returns a double that represents the average temperature in the file. You should also write a void method named testAverageTemperatureInFile() to test this method. When this method runs and selects the file for January 20, 2014, the method should print out


6. Write the method averageTemperatureWithHighHumidityInFile that has two parameters, a CSVParser named parser and an integer named value. This method returns a double that represents the average temperature of only those temperatures when the humidity was greater than or equal to value. You should also write a void method named testAverageTemperatureWithHighHumidityInFile() to test this method. When this method runs checking for humidity greater than or equal to 80 and selects the file for January 20, 2014, the method should print out


If you run the method checking for humidity greater than or equal to 80 and select the file March 20, 2014, a wetter day, the method should print out


Link to FAQ page for this course: http://www.dukelearntoprogram.com/course2/faq.php