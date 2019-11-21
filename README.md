# software-engineering-gr14-project
Gruppeprosjekt for Software engineering and testing

This software requires the use of Java, JavaFX, and JUnit. It has been developed in IntelliJ, and as such is guaranteed to work in that IDE assuming the setup is otherwise correct.

///JavaFX

To properly run a JavaFX application, one first needs to go through a few hoops.
1) First you will have to tell IntelliJ where to find the JavaFX library files by adding them under File -> Settings -> Appearance & Behavior -> Path Variables. Add a new variable, give it the name PATH_TO_FX (or any other name - edit step 3 accordingly) and give it the path to your JavaFX library installation as its value (e.g. C:\Program Files\javafx-sdk-13.0.1\lib).
2) After this step has been complete, you want to add the JavaFX library as one of your dependencies to your project: File -> Project Structure -> Project Settings -> Libraries. Click the pluss-sign to add a new Java Project Library and again navigate to your JavaFX library files.
3) As a final step, you will have to configure your Run options in the top right corner of the main IntelliJ window. Under Edit Configurations... you must paste the line under _as is_. This will finally allow you to run a JavaFX application.
--module-path ${PATH_TO_FX} --add-modules=javafx.controls,javafx.fxml


////The Prototype

The prototype is a very simple realization of the project documentation. Upon running the application, you will be met with a choice of two buttons. One will say "Admin" and the other will say "Club." These buttons are intended as an abstraction of the login process, as actually implementing username and password checks was deemed an uncessary use of time. The admin button is purposfully left unimplemented, apart from an intended error message popping up upon interaction warning of server downtime. The club button is the only one with function. Upon interaction with the club button, and new window will pop up over the previous window (which will become uninteractable until the new window closes). The new window will show you what amounts to an event creation scenario - the intent of the documentation is to show a proper portal or menu with which the user may interact, but this is another abstraction to guide you on our intended path.

This "create event window" has three buttons. One button to create an event, one to delete an event, and one to refresh the left-hand side list. As expected, the labels are self-explanatory.
The create event button will open another window in which you may enter relevant information to an event in specific text boxes - to these boxes are there no checks for valid input, so that even all empty fields will yield a successful attempt at creating an event. One caveat to this, however, is that each event that is made - empty or otherwise - will automatically be assigned a unique numerical ID. The create event window will also not close upon event creation, and as such must be manually exited.

The delete event button is slightly less intuitive than the create event button in that it does not delete a selected event from the left-hand side list, but that it instead opens a new window with another list populated with all currently created events. In this new window, one is able to either delete one (the selected) event at a time, or a more drastic deletion of all stored events - again, the window does automatically close after either of these actions and as such must be manually closed.

The refesh button will, as one expects and as was explained above, refresh the left-hand side list of the current window.

That is, ultimately, all that the prototype will afford.
