<template>
  <div id="app">  
    <form action="action_page.php">
  <div class="imgcontainer">
    <img src="../qa1.png" alt="Dashboard" width="42" height="42" class="Dashboard">
  </div>
  <div class="../qa1.png">
    <label for="addid"><b>Add ID</b></label>
    <input type="AddID" placeholder="Enter ID" name="addid" required><br>

    <label for="addfname"><b>First Name</b></label>
    <input type="Add Firstname" placeholder="Enter Firstname" name="addfname" required><br>

    <label for="addsname"><b>Surname</b></label>
    <input type="Add Surname" placeholder="Enter Surname" name="addsname" required><br>

    <label for="addaccnum"><b>AccountNumber</b></label>
    <input type="Add AccountNumber" placeholder="Enter AccountNumber" name="addaccnum" required><br>

    <button type="generateID">GenerateID</button>
  </div>
  <div class="qa1.png" style="background-color:#f1f1f1">
  </div>
</form>
  </div>
</template>
<script>
import HelloWorld from './components/HelloWorld'

export default {
  name: 'App',
  components: {
    HelloWorld
  }
}
</script>
<style>
body {
    background-color: #FFE0B5;
}

h1 {
    color: white;
    text-align: center;
}

p {
    font-family: verdana;
    font-size: 20px;
}
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>