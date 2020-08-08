# TntLocationModule

This module gets the Geo-Coordinates by scanning QR code and compares with GPS for verification,
then uses facial recognition for Identity verification of field employees.
The QR code contains the current GeoLocation of the room where the QR code is located.
Think of it as a UPI/Paytm QR-Code in a store where locaton of the store is encoded in the QR-Code.

## Algorithm used

1. Geocoordinates are encoded using base64 into a single string using (https://www.base64encode.org/) utility.
2. The corresponding QR-Code is then generated using (http://goqr.me/) or (https://www.the-qrcode-generator.com/).
3. Now this QR-Code can be scanned and corresponding string can be obtained.
4. Decode this string using (https://www.base64decode.org/).
5. This decoded string will contain the location of the room. Compare it with the GPS coordinates.
6. If decoded coordinates matches with GPS, then we are good to go.
7. This location can't be faked as if the user takes a snap of the qrcode and scans it from his home,
   the coordinates will not match as the QRCode gives location of the store.

## Sample data

1. Geo-Coordinates: 22.254189, 84.910741
2. Base64 Encoded String: MjIuMjU0MTg5LCA4NC45MTA3NDE=

![QR Code](https://i.imgur.com/0DugdyS.png)
