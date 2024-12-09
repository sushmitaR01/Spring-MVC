<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>CPV Delhi Registration Form</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <style>
    .form-container {
      max-width: 700px;
      margin: 50px auto;
      padding: 20px;
      background-color: #f7f7f7;
      border-radius: 8px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
  </style>
</head>
<body>

  <div class="form-container">
    <form>
      <h2>Register to Apply at CPV Delhi</h2>
       <form class="form-horizontal" action="passport" method="post">

       <div class="container mt-5"> <form>
       <div class="form-check">
       Registertoapplyat</br>
       <input class="form-check-input" type="radio" name="Registertoapplyat" id="CPV Delhi" value="CPV Delhi" checked>
       <label class="form-check-label" for="CPV Delhi"> CPV Delhi 1 </label> </div></br>

       <div class="form-check">
       <input class="form-check-input" type="radio" name="Registertoapplyat" id="Passport Office" value="Passport Office">
       <label class="form-check-label" for="Passport Office"> Passport Office </label> </div>






      <div class="form-group">
        <label for="PassportOffice">Passport Office</label>
        <select class="form-control" id="PassportOffice" required>
          <option value="" disabled selected>----- Select -----</option>
          <option value="Ahamadabad"> Ahamadabad</option>
          <option value="Kerala"> Kerala</option>
          <option value="Bangalaru"> Bangalaru</option>
          <option value="Hubli"> Hubli</option>
          <option value=" Delhi"> Delhi</option>
          <option value=" Maharastra"> Maharastra</option>
          <option value="kerala"> kerala</option>

        </select>
      </div>
      <div class="form-group">
        <label for="GiveName">Given Name (Max 45 Characters)</label>
        <input type="text" class="form-control" id="GiveName" placeholder="First Name + Middle Name" maxlength="45" required>
      </div>
      <div class="form-group">
        <label for="Surname">Surname (Max 45 Characters)</label>
        <input type="text" class="form-control" id="Surname" placeholder="Surname" maxlength="45">
      </div>
      <div class="form-group">
        <label for="DateofBirth">Date of Birth (DD/MM/YYYY)</label>
        <input type="date" class="form-control" id="DateofBirth" placeholder="DD/MM/YYYY" required>
      </div>
      <div class="form-group">
        <label for="EmailId">Email ID (Max 35 Characters)</label>
        <input type="EmailId" class="form-control" id="EmailId" placeholder="Enter email" maxlength="35" required>
      </div>

      <div class="form-check">DoyouwantyourLoginId</br>
       <input class="form-check-input" type="radio" name="DoyouwantyourLoginId" id="yes" value="yes">
       <label class="form-check-label" for="yes"> Yes </label>
       </div>

        <div class="form-check">
              <input class="form-check-input" type="radio" name="DoyouwantyourLoginId" id="No" value="No">
              <label class="form-check-label" for="No"> No </label>
              </div>




      <div class="form-group">
        <label for="LoginId">Login ID</label>
        <input type="text" class="form-control" id="LoginId" placeholder="Enter login ID" required>
      </div>
      <div class="form-group">
        <label for="Password">Password</label>
        <input type="Password" class="form-control" id="Password" placeholder="Enter password" required>
      </div>
      <div class="form-group">
        <label for="ConfirmPassword">Confirm Password</label>
        <input type="password" class="form-control" id="ConfirmPassword" placeholder="Confirm password" required>
      </div>
      <div class="form-group">
        <label for="HintQuestion">Hint Question</label>
        <select class="form-control" id="HintQuestion" required>
          <option value="select" disabled selected>----- Select -----</option>
          <option value="which is favotite food" disabled selected>which is favotite food</option>
          <option value="date of birth" disabled selected>date of birth</option>
          <option value="faviorate colour" disabled selected>faviorate colour</option>
          <option value="faviorate dish" disabled selected>faviorate dish</option>
          <option value="faviorite ice cream" disabled selected>faviorite ice cream</option>
          <option value="faviorate dresses" disabled selected>faviorate dresses</option>

        </select>
      </div>
      <div class="form-group">
        <label for="HintAnswer">Hint Answer</label>
        <input type="text" class="form-control" id="HintAnswer" placeholder="Enter hint answer" required>
      </div>

      <button type="submit" class="btn btn-primary">Register</button>
      <button type="submit" class="btn btn-primary">Clear</button>
    </form>
  </div>

  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
