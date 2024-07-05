/*Use Case:
1. Launch the Freeform iOS app(com.apple.freefrom)
2. Tap on the New Board.
3. Tap on Add Sticky Notes.
4. Write a text.
5. Click on Done.
6. Delete the Sticky Notes.
7. Tap on Add shape
8. Tap on Animal
9. Tap on Horse.
10. Tap on Done.
11. Delete Horse.
12. Tap on the Add Text box.
13. Write a text.
14. Tap on Done.
15. Delete the Text box.
16 Close the app.*/
/*
*  Perform the specified actions in the Freeform iOS app
*
*  @param appBundleId The bundle ID of the Freeform iOS app
*/
// Launch the Freeform iOS app
Mobile.startApplication(['bundleId': 'com.apple.freeform'])

// Tap on the New Board
Mobile.tap(findTestObject('xpath://*[@text="New Board"]'))

// Tap on Add Sticky Notes
Mobile.tap(findTestObject('xpath://*[@text="Add Sticky Notes"]'))

// Write a text
Mobile.setText(findTestObject('xpath://*[@text="Sticky Notes"]'), 'Sample text')

// Click on Done
Mobile.tap(findTestObject('xpath://*[@text="Done"]'))

// Delete the Sticky Notes
Mobile.tap(findTestObject('xpath://*[@text="Delete"]'))

// Tap on Add shape
Mobile.tap(findTestObject('xpath://*[@text="Add shape"]'))

// Tap on Animal
Mobile.tap(findTestObject('xpath://*[@text="Animal"]'))

// Tap on Horse
Mobile.tap(findTestObject('xpath://*[@text="Horse"]'))

// Tap on Done
Mobile.tap(findTestObject('xpath://*[@text="Done"]'))

// Delete Horse
Mobile.tap(findTestObject('xpath://*[@text="Delete"]'))

// Tap on the Add Text box
Mobile.tap(findTestObject('xpath://*[@text="Add Text box"]'))

// Write a text
Mobile.setText(findTestObject('xpath://*[@text="Text box"]'), 'Sample text')

// Tap on Done
Mobile.tap(findTestObject('xpath://*[@text="Done"]'))

// Delete the Text box
Mobile.tap(findTestObject('xpath://*[@text="Delete"]'))

// Close the app
Mobile.closeApplication()