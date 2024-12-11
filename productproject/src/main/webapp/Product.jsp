
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Product Application</title>
</head>
<body>
${Successmessage}
${msg}
<form action="order" method="post">
  <pre>
    Product Name<input type="text" name="name" value="${message.name}">
    Product Type<select name="type" value="${message.type}">
    <option value="select">--select--</option>
    <option value="kitchen Appliences">Kitchen Appliences</option>
    <option value="electronic Devices">Electronic Devices</option>
    <option value="laboratory Devices">Laboratory Devices</option>
  </select>
  Product Cost<input type="number" name="cost" value="${message.cost}">
    Product Manufacturer<select name="manufacturer" value="${message.manufacturer}">
    <option value="select">--select--</option>
    <option value="punit">Punit Patil</option>
    <option value="sneha">Sneha Patil</option>
    <option value="Srushti">Srushti Patil</option>
  </select>
  Order Date<input type="date" name="date" value="${message.date}">
    Warranty<input type="text" name="warranty" value="${message.warranty}">
    <input type="submit" Value="Order">

  </pre>
</form>
</body>
</html>
