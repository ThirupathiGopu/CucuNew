Feature: Loginpage 

Scenario: Login wth valid credentails

Given launch browser 
And Enter Urls "https://admin-demo.nopcommerce.com/login"
Then Enter user name "admin@yourstore.com"
And Enter password "admin"
Then Click on Login button
Then click on logout button
And closebrowser 
