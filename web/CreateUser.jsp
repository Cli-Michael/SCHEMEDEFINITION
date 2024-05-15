<%-- 
    Document   : CreateUser
    Created on : 18 May, 2023, 7:07:44 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- Coding by CodingLab | www.codinglabweb.com -->
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!----======== CSS ======== -->
    <link rel="stylesheet" href="css/form.css">

    <!----===== Boxicons CSS ===== -->
    <link href='https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css' rel='stylesheet'>

    <title>Add</title>
</head>

<body>
    <nav class="sidebar close">
        <header>
            <div class="image-text">
                <span class="image">
                    <img src="images/AP-logo.png" alt="">
                </span>

                <div class="text logo-text">
                    <span class="name">Asian Paints</span>
                    <span class="profession">Scheme Definition</span>
                </div>
            </div>

            <i class='bx bx-chevron-right toggle'></i>
        </header>

        <div class="menu-bar">
            <div class="menu">

                <li class="search-box">
                    <i class='bx bx-search icon'></i>
                    <input type="text" placeholder="Search...">
                </li>

                <ul class="menu-links">
            <li class="nav-link">
              <a href="#">
                <i class="bx bx-home-alt icon"></i>
                <span class="text nav-text">Home</span>
              </a>
            </li>

            <li class="nav-link">
              <a href="View.jsp">
                <i class="bx bx-file-blank icon"></i>
                <span class="text nav-text">View</span>
              </a>
            </li>

            <li class="nav-link">
              <a href="Users.jsp">
                <i class="bx bx-group icon"></i>
                <span class="text nav-text">Users</span>
              </a>
            </li>
          </ul>
            </div>

            <div class="bottom-content">
                <li class="">
                    <a href="Adminlogin.html">
                        <i class='bx bx-log-out icon'></i>
                        <span class="text nav-text">Logout</span>
                    </a>
                </li>

                <li class="mode">
                    <div class="sun-moon">
                        <i class='bx bx-moon icon moon'></i>
                        <i class='bx bx-sun icon sun'></i>
                    </div>
                    <span class="mode-text text">Dark mode</span>

                    <div class="toggle-switch">
                        <span class="switch"></span>
                    </div>
                </li>

            </div>
        </div>

    </nav>

    <section class="home">
        <div id="header" class="tophead">

            <ul>
                <li>Create User</li>
            </ul>
        </div>
        <div class="mainbg" style="overflow-x: auto; overflow-y: auto;">
            <form action="AgentCreator" method="post" class="frm">
                <h1>Create User</h1>

                <fieldset>

                    <label for="name">Username:</label>
                    <input type="text" id="name" name="username" required="">

<!--                    <label for="name">Region:</label>
                    <select id="reason" name="reason" required>
                        <option disabled selected value>Select Here</option>
                        <option value="Yes">Yes</option>
                        <option value="No">No</option>
                      </select>

                    <label for="name">Division:</label>
                    <select id="reason" name="reason" required>
                        <option disabled selected value>Select Here</option>
                        <option value="Yes">Yes</option>
                        <option value="No">No</option>
                      </select>-->

                    <label for="password">Password:</label>
                    <input type="password" id="password" name="npass" required="">

                    <label for="password">Re-Type Password:</label>
                    <input type="password" id="password" name="cpass" required="">

                    
                </fieldset>
                
                    <input type="submit" class="createbtn" value="Create">
                
            </form>
        </div>
        <!-- <div class="text">Data Will Apaire Here</div> -->
    </section>

    <script>
        const body = document.querySelector('body'),
            sidebar = body.querySelector('nav'),
            toggle = body.querySelector(".toggle"),
            searchBtn = body.querySelector(".search-box"),
            modeSwitch = body.querySelector(".toggle-switch"),
            modeText = body.querySelector(".mode-text");
        toggle.addEventListener("click", () => {
            sidebar.classList.toggle("close");
        })
        searchBtn.addEventListener("click", () => {
            sidebar.classList.remove("close");
        })
        modeSwitch.addEventListener("click", () => {
            body.classList.toggle("dark");
            if (body.classList.contains("dark")) {
                modeText.innerText = "Light mode";
            } else {
                modeText.innerText = "Dark mode";
            }
        });
    </script>

</body>

</html>
