# TntLocationModule

This Module uses Two-Factor Location Verification which makes it difficult to be faked by Store employees. It does so by getting the Geo-Coordinates from a QR code, then comparing it with the location from the GPS of the device. Think of it as a UPI QR-Code in a store where locaton of the store is encoded in the QR-Code. The below diagram explains how it works:

  ![QR Code](https://i.imgur.com/3Rk7jlx.png)

## Algorithm used

1. Geo-coordinates are Base64 encoded into a single string using https://www.base64encode.org/ utility.
2. A QR-Code is then generated from the encoded string using http://goqr.me/ or https://www.the-qrcode-generator.com/.
3. Now this QR-Code can be scanned and corresponding string can be obtained.
4. Decode this string using https://www.base64decode.org/. This string will contain the location of the room.
5. Compare it with the GPS coordinates of the device.
6. If decoded coordinates matches with GPS, then we are good to go.
7. This location is difficult to be faked as if the user takes a snap of the qrcode and scans it from his home,
   the coordinates will not match as the QR-Code still gives location of the store.

## Sample data

1. Geo-Coordinates: `22.254189, 84.910741`
2. Base64 Encoded String: `MjIuMjU0MTg5LCA4NC45MTA3NDE=`

  ![QR Code](https://i.imgur.com/0DugdyS.png)

3. Scan this QR-Code to get the corresponding location.

## Apk File

Download the APK from [here](https://drive.google.com/file/d/0BwcoMJ0DNQ-RY25fcUhCNWJMUW8/view?usp=sharing).
