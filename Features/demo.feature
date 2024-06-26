Feature: Demo application

# If we use Background keyword, steps under the background kwyword will run before running any sceanrios step in this feature file. it will act as a pre-requisites
Background: 
Given setting the database entries
When launch browser from config variables
Then expected result

#Basic 
@tag1
Scenario: Application login
Given launch the application
When login with username "Sandy" and password "abcd"
Then Home will be displayed

#Mutiple input in Scenario
@tag2
Scenario: Application login
Given launch the application
When enter the login details
| Sandy |
| udemy |
| San@gmail.com |
| 1234569078 |
Then Home will be displayed

#Basic Parametization
@tag3
Scenario Outline: Application login
Given launch the application
When login with username <user> and password <pass>
When login with username admin and password abc
Then Home will be displayed

Examples:
| user | pass |
| 1Sandy | abcd |
| 2Sandy | edfg |


#Regex input
@tag4
Scenario Outline: Application login
Given launch the application
When login with username <user> and password <pass>
When login with username 3234 and password 1234
Then Home will be displayed

Examples:
| user | pass |
| 3Sandy | abcd |
| 4Sandy | edfg |

