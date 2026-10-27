Feature: To verify the AboutUs Page.
  
Scenario: verify the header in the aboutUs Page
  Given user is on the About Us page
  When verify the title in About Us page
  Then click on Contact us link
  And verify the email address
  Then verify the Talk to Us