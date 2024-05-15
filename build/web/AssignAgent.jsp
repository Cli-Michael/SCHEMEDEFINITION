<%-- 
    Document   : View
    Created on : 21 May, 2023, 10:28:49 PM
    Author     : DELL
--%>

<%@page import="Model.Users"%>
<%@page import="java.util.List"%>
<%@page import="Model.Scheme"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- Coding by CodingLab | www.codinglabweb.com -->
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!----======== CSS ======== -->
        <link rel="stylesheet" href="css/all user.css">

        <!----===== Boxicons CSS ===== -->
        <link href='https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css' rel='stylesheet'>

        <title>View</title>
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
                        
                        <li class="nav-link">
                            <a href="AssignAgent.jsp">
                                <i class="bx bx-group icon"></i>
                                <span class="text nav-text">Assign Agent</span>
                            </a>
                        </li>
                        
                        <li class="nav-link">
                            <a href="Exporter.jsp">
                                <i class="bx bx-export icon"></i>
                                <span class="text nav-text">Export</span>
                            </a>
                        </li>
                    </ul>
                </div>

                <div class="bottom-content">
                    <li class="">
                        <a href="javascript:confirmation()">
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
                    <li>List</li>
                </ul>
            </div>
            <div class="mainbg">
                <form id="myForm" method="post" action="AgentAssigner">
                    <label style="margin-left: 20px; margin-top: 20px;">Total</label>
                    <input type="text" value="<%= Resource.MyFunctions.countTotal()%>" readonly/>
                    <label style="margin-left: 20px;">Pending to Assign</label>
                    <input type="text" placeholder="<%= Resource.MyFunctions.countUnAssigned()%>" name="count"/>
                    <% List<Users> list_ = Resource.MyFunctions.getAgents(); %>
                    <select style="margin-left: 20px;" name="agentname" class="form-select" id="agentname" style="width:auto;">
                        <option disabled selected value>Select Agent</option>
                        <% for (Users us : list_) {%>
                        <option value="<%= us.getUsername()%>"><%= us.getUsername()%></option>
                        <% }%>
                    </select>

                    <a href="#" onclick="submitForm()" style="margin-left: 20px;">
                        Assign
                    </a>
                </form>

                <div style="overflow-x:auto; overflow-y:auto;"
                     class="appointment-table">
                    <table>
                        <thead>
                            <tr>
                                <th scope="col">Region</th>
                                <th scope="col">Division</th>
                                <th scope="col">Assigned Status</th>
                                <!--                                <th scope="col">Edit</th>
                                                                <th scope="col">Delete</th>-->
                            </tr>
                        </thead>
                        <tbody>
                            <% List<Scheme> list = Resource.MyFunctions.getRegionDivisionUnassigned(); %>

                            <% for (Scheme s : list) {%>
                            <tr>
                                <td data-label="region"><%= s.getRegion()%></td>
                                <td data-label="division"><%= s.getDivision()%></td>
                                <td data-label="division"><%= s.getAssigned()%></td>
                            </tr>
                            <% }%>
                        </tbody>
                    </table>
                </div>
                <div class="head">
                    <!-- <div class="searchbar">
                        <form action="#">
                            <input type="text" placeholder="Search.." name="search">
                            <button type="submit"><i class='bx bx-search-alt icon'></i></button>
                        </form>
                    </div> -->
                </div>
            </div>
        </div>
        <!-- <div class="text">Data Will Apaire Here</div> -->
    </section>

    <script>
        function submitForm() {
            document.getElementById("myForm").submit();
        }
    </script>

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

    <script>

        function confirmation() {
            var txt;
            var r = confirm("Are you sure you want to Logout ?");
            if (r == true) {
                window.location.href = 'Logouter';
            }

        }
    </script>  
</body>
</html>
