# MobiSocial_Code_Session_2
* App with two screen
* Float Action Button
* Share functionality

#Implementation
* Create a new application in Android Studio for phones and tablets, called CodeSession2, company name mobisocial.oulu.fi, with a minimum SDK of API 14 (Ice Cream Sandwich). Choose an Empty Activity as the template. Call this activity CodeSession2, generate layout file and backwards compatibility is checked.
* Open the layout file and insert a EditText field, change its ID (edit_text).
* Add a FloatingActionButton (add library) - search for the share icon. Assign it an ID (share_button).
* Implement an “onClickListener” for your button with an intent. Set the intent extra to get the text of your textfield.
* Add a (regular) button (about_btn) and put it in the corner. Create a new layout file that will display information about the application developer (about.xml).
* Add a textview in the new layout file and add your name as ‘text’.
* Implement an “onClickListener” for the about button and set the content view to your new layout file.
