<%-- 
    Document   : EditScheme
    Created on : 18 May, 2023, 6:32:47 PM
    Author     : DELL
--%>

<%@page import="Model.Scheme"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- Coding by CodingLab | www.codinglabweb.com -->
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link
            href="https://allfont.net/allfont.css?fonts=montserrat-bold"
            rel="stylesheet"
            type="text/css"
            />
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
            />
        <link
            href="https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css"
            rel="stylesheet"
            />
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>


        <!----======== CSS ======== -->
        <link rel="stylesheet" href="css/styles.css" />

        <!----===== Boxicons CSS ===== -->
        <link
            href="https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css"
            rel="stylesheet"
            />

        <%  String id = request.getParameter("id");
            Scheme s = Resource.MyFunctions.getSingleScheme(id);

            System.out.println("Value: " + s.getDefineBy());
        %>



        <title>Asian Paints - Scheme Definition</title>
    </head>

    <body>
        <nav class="sidebar close">
            <header>
                <div class="image-text">
                    <span class="image">
                        <img src="images/AP-logo.png" alt="" />
                    </span>

                    <div class="text logo-text">
                        <span class="name">Asian Paints</span>
                        <span class="profession">Scheme Definition</span>
                    </div>
                </div>

                <i class="bx bx-chevron-right toggle"></i>
            </header>

            <div class="menu-bar">
                <div class="menu">
                    <li class="search-box">
                        <i class="bx bx-search icon"></i>
                        <input type="text" placeholder="Search..." />
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
                        <a href="javascript:confirmation()">
                            <i class="bx bx-log-out icon"></i>
                            <span class="text nav-text">Logout</span>
                        </a>
                    </li>

                    <li class="mode">
                        <div class="sun-moon">
                            <i class="bx bx-moon icon moon"></i>
                            <i class="bx bx-sun icon sun"></i>
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
                    <li>Asian Paints - Scheme Definition</li>
                </ul>
            </div>
            <form action="EditScheme" method="post">
                <div class="mainbg" style="overflow-x: auto; overflow-y: auto">
                    <!-- save button start -->

                    <button
                        id="input_scl_2"
                        type="submit"
                        class="savebutton"
                        data-component="button"
                        >
                        Save
                    </button>
                    <a href="View.jsp">
                        <button
                            id="input_scl_1"
                            type="button"
                            class="backbutton"
                            data-component="button"
                            >
                            Cancel
                        </button>
                    </a>
                    <!-- save button end -->
                    <div class="elementsbg">
                        <!-- input data start -->
                        <div class="elementsleft">
                            <div class="form-group">
                                <label id="region-label" for="region"
                                       ><p><span class="clue">Region</span></p></label
                                >
                                <input
                                    type="text"
                                    name="Region"
                                    id="region"
                                    class="form-control"
                                    placeholder="Region"
                                    value="<%= s.getRegion()%>"
                                    />
                            </div>
                            <div class="form-group">
                                <label id="division-label" for="division"
                                       ><p><span class="clue">Division</span></p></label
                                >
                                <input
                                    type="text"
                                    name="Division"
                                    id="division"
                                    class="form-control"
                                    placeholder="Division"
                                    value="<%= s.getDivision()%>"
                                    />
                            </div>
                            <div class="form-group">
                                <label id="schemedate-label" for="schemedate"
                                       ><p>
                                        <span class="clue">Scheme Letter Received Date</span>
                                    </p></label
                                >
                                <input
                                    type="date"
                                    name="SchemeLetterReceivedDate"
                                    id="SchemeLetterReceivedDate"
                                    class="form-control"
                                    value="<%= s.getSchemeLetterReceivedDate()%>"
                                    />
                            </div>
                            <div class="form-group">
                                <label id="schemetime-label" for="schemetime"
                                       ><p>
                                        <span class="clue">Scheme Letter Received Time</span>
                                    </p></label
                                >
                                <input
                                    type="time"
                                    name="SchemeLetterReceivedTime"
                                    id="schemetime"
                                    class="form-control"
                                    value="<%= s.getSchemeLetterReceivedTime()%>"
                                    />
                            </div>
                            <div class="form-group">
                                <label id="schemename-label" for="schemename"
                                       ><p><span class="clue">Scheme Letter Name</span></p></label
                                >
                                <input
                                    type="text"
                                    name="SchemeLetterName"
                                    id="schemename"
                                    class="form-control"
                                    placeholder="Scheme Letter Name"
                                    value="<%= s.getSchemeLetterName()%>"
                                    />
                            </div>
                            <div class="form-group">
                                <label id="schemetype-label" for="schemetype"
                                       ><p><span class="clue">Scheme Type</span></p></label
                                >
                                <input
                                    type="text"
                                    name="SchemeType"
                                    id="schemetype"
                                    class="form-control"
                                    placeholder="Scheme Type"
                                    value="<%= s.getSchemeType()%>"
                                    />
                            </div>
                            <div class="form-group">
                                <label id="component-label" for="component"
                                       ><p><span class="clue">Component</span></p></label
                                >
                                <input
                                    type="text"
                                    name="Component"
                                    id="component"
                                    class="form-control"
                                    placeholder="Component"
                                    value="<%= s.getComponent()%>"
                                    />
                            </div>
                            <div class="form-group">
                                <label id="schemeid-label" for="schemeid"
                                       ><p><span class="clue">Scheme ID</span></p></label
                                >
                                <input
                                    type="text"
                                    name="SchemeID"
                                    id="schemeid"
                                    class="form-control"
                                    placeholder="Scheme ID"
                                    value="<%= s.getSchemeID()%>"
                                    />
                            </div>
                            <div class="form-group">
                                <label id="requirementdetails-label" for="requirementdetails"
                                       ><p>
                                        <span class="clue">Additional Requirement Details</span>
                                    </p></label
                                >
                                <input
                                    type="text"
                                    name="AdditionalRequirementDetails"
                                    id="requirementdetails"
                                    class="form-control"
                                    placeholder="Additional Requirement Details"
                                    value="<%= s.getAdditionalRequirementDetails()%>"
                                    />
                            </div>
                            <div class="form-group">
                                <label id="requestdate-label" for="requestdate"
                                       ><p><span class="clue">Request Date</span></p></label
                                >
                                <input
                                    type="date"
                                    name="RequestDate"
                                    id="requestdate"
                                    class="form-control"
                                    value="<%= s.getRequestDate()%>"
                                    />
                            </div>
                            <div class="form-group">
                                <label id="changesdate-label" for="changesdate"
                                       ><p><span class="clue">Changes Date</span></p></label
                                >
                                <input
                                    type="date"
                                    name="ChangesDate"
                                    id="changesdate"
                                    class="form-control"
                                    value="<%= s.getChangesDate()%>"
                                    />
                            </div>
                            <div class="form-group">
                                <label
                                    id="differentrequirement-label"
                                    for="differentrequirement"
                                    ><p>
                                        <span class="clue"
                                              >Different Requirement From Unit<br />&nbsp(Not As per
                                            Scheme Letter)</span
                                        >
                                    </p></label
                                >
                                <input
                                    type="text"
                                    name="DifferentRequirementFromUnit"
                                    id="differentrequirement"
                                    class="form-control"
                                    placeholder="Different Requirement From Unit"
                                    value="<%= s.getDifferentRequirementFromUnit()%>"
                                    />
                            </div>
                            <div class="form-group">
                                <label id="defineby-label" for="defineby">
                                    <p><span class="clue">Define By</span></p></label
                                >
                                <select
                                    id="defineby"
                                    name="DefineBy"
                                    class="form-control"

                                    >
                                    <option disabled selected value>Select Here</option>
                                    <option value="Yes">Yes</option>
                                    <option value="No">No</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label id="reason-label" for="reason">
                                    <p><span class="clue">Reason For Not Define</span></p></label
                                >
                                <!--                                <select id="ReasonForNotDefine" name="ReasonForNotDefine" class="form-control" >
                                                                    <option disabled selected value>Select Here</option>
                                                                    <option value="Yes">Yes</option>
                                                                    <option value="No">No</option>
                                                                </select>-->
                                <input
                                    type="text"
                                    name="ReasonForNotDefine"
                                    id="ReasonForNotDefine"
                                    class="form-control"
                                    value="<%= s.getReasonForNotDefine()%>"
                                    placeholder="Reason For Not Define"
                                    />
                            </div>
                            <div class="form-group">
                                <label id="status-label" for="status">
                                    <p><span class="clue">Status</span></p></label
                                >
                                <!--                                <select id="status" name="Status" class="form-control" >
                                                                    <option disabled selected value>Select Here</option>
                                                                    <option value="Yes">Yes</option>
                                                                    <option value="No">No</option>
                                                                </select>-->
                                <input
                                    type="text"
                                    name="Status"
                                    id="Status"
                                    class="form-control"
                                    value="<%= s.getStatus()%>"
                                    placeholder="Status"
                                    />
                            </div>
                            <div class="form-group">
                                <label id="definetime-label" for="definetime"
                                       ><p><span class="clue">Define Date</span></p></label
                                >
                                <input
                                    type="date"
                                    name="DefineTime"
                                    id="DefineDate"
                                    class="form-control"
                                    value="<%= s.getDefineTime()%>"
                                    />
                            </div>
                            <div class="form-group">
                                <label id="starttime-label" for="starttime"
                                       ><p><span class="clue">Start Time</span></p></label
                                >
                                <input
                                    type="time"
                                    name="StartTime"
                                    id="starttime"
                                    class="form-control"
                                    value="<%= s.getStartTime()%>"
                                    />
                            </div>
                            <div class="form-group">
                                <label id="endtime-label" for="endtime"
                                       ><p><span class="clue">End Time</span></p></label
                                >
                                <input
                                    type="time"
                                    name="EndTime"
                                    id="endtime"
                                    class="form-control"
                                    value="<%= s.getEndTime()%>"
                                    onchange="calculateTimeDifference()"
                                    />
                            </div>
                            <div class="form-group">
                                <label id="ageing-label" for="ageing"
                                       ><p><span class="clue">Ageing</span></p></label
                                >
                                <input
                                    type="text"
                                    name="Ageing"
                                    id="ageing"
                                    class="form-control"
                                    placeholder="Ageing"
                                    value="<%= s.getAgeing()%>"
                                    />
                            </div>
                        </div>
                        <!-- elementsright div  -->
                        <div class="elementsright">
                            <div class="form-group">
                                <label id="day-label" for="day">
                                    <p><span class="clue">Day</span></p></label
                                >
                                <!--                                <select id="day" name="Day" class="form-control" >
                                                                    <option disabled selected value>Select Here</option>
                                                                    <option value="Yes">Yes</option>
                                                                    <option value="No">No</option>
                                                                </select>-->
                                <input
                                    type="text"
                                    name="Day"
                                    id="Days"
                                    class="form-control"
                                    value="<%= s.getDay() %>"
                                    placeholder="Status"
                                    />
                            </div>
                            <div class="form-group">
                                <label id="schemedate-label" for="schemedate"
                                       ><p><span class="clue">Scheme Date</span></p></label
                                >
                                <input
                                    type="date"
                                    name="SchemeDate"
                                    id="SchemeDate"
                                    class="form-control"
                                    value="<%= s.getSchemeDate()%>"
                                    />
                            </div>
                            <div class="form-group">
                                <label id="days-label" for="days"
                                       ><p><span class="clue">Days</span></p></label
                                >
                                <input
                                    type="Number"
                                    name="Days"
                                    id="days"
                                    class="form-control"
                                    placeholder="Days"
                                    value="<%= s.getDays()%>"
                                    />
                            </div>
                            <div class="form-group">
                                <label id="tat-label" for="tat"
                                       ><p><span class="clue">TAT</span></p></label
                                >
                                <input
                                    type="Number"
                                    name="TAT"
                                    id="tat"
                                    class="form-control"
                                    placeholder="TAT"
                                    value="<%= s.getTAT()%>"
                                    />
                            </div>
                            <div class="form-group">
                                <label id="schemedeployed-label" for="schemedeployed">
                                    <p><span class="clue">Scheme Deployed</span></p></label
                                >
                                <select
                                    id="SchemeDeployed"
                                    name="SchemeDeployed"
                                    class="form-control"

                                    >
                                    <option disabled selected value>Select Here</option>
                                    <option value="Yes">Yes</option>
                                    <option value="No">No</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label id="checkerdate-label" for="checkerdate"
                                       ><p><span class="clue">Checker 1 Date</span></p></label
                                >
                                <input
                                    type="date"
                                    name="Checker1Date"
                                    id="Checker1Date"
                                    class="form-control"
                                    value="<%= s.getChecker1Date()%>"
                                    />
                            </div>
                            <div class="form-group">
                                <label id="checkername-label" for="checkername"
                                       ><p><span class="clue">Checker 1 Name</span></p></label
                                >
                                <input
                                    type="text"
                                    name="Checker1Name"
                                    id="checkername"
                                    class="form-control"
                                    placeholder="Checker 1 Name"
                                    value="<%= s.getChecker1Name()%>"
                                    />
                            </div>
                            <div class="form-group">
                                <label id="error-label" for="error">
                                    <p><span class="clue">Error</span></p></label
                                >
                                <select id="error" name="Error" class="form-control" >
                                    <option disabled selected value>Select Here</option>
                                    <option value="Yes">Yes</option>
                                    <option value="No">No</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label id="errors-label" for="errors"
                                       ><p><span class="clue">Error</span></p></label
                                >
                                <input
                                    type="text"
                                    name="Error"
                                    id="errors"
                                    class="form-control"
                                    placeholder="Error"
                                    value="<%= s.getError()%>"
                                    />
                            </div>
                            <div class="form-group">
                                <label id="solved-label" for="solved">
                                    <p><span class="clue">Solved</span></p></label
                                >
                                <select id="solved" name="Solved" class="form-control" >
                                    <option disabled selected value>Select Here</option>
                                    <option value="Yes">Yes</option>
                                    <option value="No">No</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label id="errorhighlighted-label" for="errorhighlighted">
                                    <p>
                                        <span class="clue">Error Highlighted By Region</span>
                                    </p></label
                                >
                                <select
                                    id="ErrorHighlightedByRegion"
                                    name="ErrorHighlightedByRegion"
                                    class="form-control"

                                    >
                                    <option disabled selected value>Select Here</option>
                                    <option value="Yes">Yes</option>
                                    <option value="No">No</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label id="regionname-label" for="regionname"
                                       ><p><span class="clue">Region Name</span></p></label
                                >
                                <input
                                    type="text"
                                    name="RegionName"
                                    id="regionname"
                                    class="form-control"
                                    placeholder="Region Name"
                                    value="<%= s.getRegionName()%>"
                                    />
                            </div>
                            <div class="form-group">
                                <label id="erroraccepted-label" for="erroraccepted">
                                    <p><span class="clue">Error Accepted</span></p></label
                                >
                                <select
                                    id="ErrorAccepted"
                                    name="ErrorAccepted"
                                    class="form-control"

                                    >
                                    <option disabled selected value>Select Here</option>
                                    <option value="Yes">Yes</option>
                                    <option value="No">No</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label id="errordescription-label" for="errordescription"
                                       ><p><span class="clue">Error Description</span></p></label
                                >
                                <input
                                    type="text"
                                    name="ErrorDescription"
                                    id="errordescription"
                                    class="form-control"
                                    placeholder="Error Description"
                                    value="<%= s.getErrorDescription()%>"
                                    />
                            </div>
                            <div class="form-group">
                                <label id="officername-label" for="officername"
                                       ><p>
                                        <span class="clue">Highlighted By Officer Name</span>
                                    </p></label
                                >
                                <input
                                    type="text"
                                    name="HighlightedByOfficerName"
                                    id="officername"
                                    class="form-control"
                                    placeholder="Highlighted By Officer Name"
                                    value="<%= s.getHighlightedByOfficerName()%>"
                                    />
                            </div>
                            <div class="form-group">
                                <label id="highlighteddate-label" for="highlighteddate"
                                       ><p><span class="clue">Highlighted Date</span></p></label
                                >
                                <input
                                    type="date"
                                    name="HighlightedDate"
                                    id="HighlightedDate"
                                    class="form-control"
                                    value="<%= s.getHighlightedDate()%>"
                                    />
                            </div>
                            <div class="form-group">
                                <label id="rectified-label" for="rectified">
                                    <p><span class="clue">Rectified</span></p></label
                                >
                                <select
                                    id="Rectified"
                                    name="Rectified"
                                    class="form-control"

                                    >
                                    <option disabled selected value>Select Here</option>
                                    <option value="Yes">Yes</option>
                                    <option value="No">No</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label id="rectificationdate-label" for="rectificationdate"
                                       ><p><span class="clue">Rectification Date</span></p></label
                                >
                                <input
                                    type="date"
                                    name="RectificationDate"
                                    id="RectificationDate"
                                    class="form-control"
                                    value="<%= s.getRectificationDate()%>"
                                    />
                            </div>
                            <div class="form-group">
                                <label id="resolvingtime-label" for="resolvingtime"
                                       ><p>
                                        <span class="clue"
                                              >Resolving Time<br />&nbsp(Highlighted Date - Resolving
                                            Date)</span
                                        >
                                    </p></label
                                >
                                <input
                                    type="text"
                                    name="ResolvingTime"
                                    id="ResolvingTime"
                                    class="form-control"
                                    placeholder="Resolving Time"
                                    />
                                <input type="hidden" value="<%= id%>" name="id" /> 
                            </div>
                        </div>
                    </div>
                </div>

            </form>
        </section>

        <script>
            const body = document.querySelector("body"),
                    sidebar = body.querySelector("nav"),
                    toggle = body.querySelector(".toggle"),
                    searchBtn = body.querySelector(".search-box"),
                    modeSwitch = body.querySelector(".toggle-switch"),
                    modeText = body.querySelector(".mode-text");
            toggle.addEventListener("click", () => {
                sidebar.classList.toggle("close");
            });
            searchBtn.addEventListener("click", () => {
                sidebar.classList.remove("close");
            });
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
            $(document).ready(function () {
                var defineBy = '<%= s.getDefineBy()%>';   // Assuming you have assigned the Java variable value to this JavaScript variable
                var Status = '<%= s.getStatus()%>';
                var ReasonForNotDefine = '<%= s.getReasonForNotDefine()%>';
                var Day = '<%= s.getDay()%>';
                var SchemeDeployed = '<%= s.getSchemeDeployed()%>';
                var Error = '<%= s.getError()%>';
                var Solved = '<%= s.getSolved()%>';
                var ErrorHighlightedByRegion = '<%= s.getErrorHighlightedByRegion()%>';
                var ErrorAccepted = '<%= s.getErrorAccepted()%>';
                var Rectified = '<%= s.getRectified()%>';

                $('#defineby').val(defineBy);
                $('#status').val(Status);
                $('#ReasonForNotDefine').val(ReasonForNotDefine);
                $('#day').val(Day);
                $('#SchemeDeployed').val(SchemeDeployed);
                $('#error').val(Error);
                $('#solved').val(Solved);
                $('#ErrorHighlightedByRegion').val(ErrorHighlightedByRegion);
                $('#ErrorAccepted').val(ErrorAccepted);
                $('#Rectified').val(Rectified);

            });
        </script>



        <script>
            var SchemeLetterReceivedDate = document.getElementById("SchemeLetterReceivedDate");
            var SchemeDate = document.getElementById("SchemeDate");

            SchemeLetterReceivedDate.onchange = function () {
                SchemeDate.value = SchemeLetterReceivedDate.value;
            };
        </script>

        <script>
            var DefineTime = document.getElementById("DefineDate");
            var Checker1Date = document.getElementById("Checker1Date");

            DefineTime.onchange = function () {
                Checker1Date.value = DefineTime.value;
            };
        </script>

        <script>
            window.onload = function () {
                var HighlightedDate = document.getElementById("HighlightedDate").value;
                var RectificationDate = document.getElementById("RectificationDate").value;

                var firstDate = new Date(formatDate(HighlightedDate));
                var secondDate = new Date(formatDate(RectificationDate));

                var differenceInMilliseconds = secondDate - firstDate;
                var differenceInDays = Math.floor(differenceInMilliseconds / (1000 * 60 * 60 * 24));

                document.getElementById("ResolvingTime").value = differenceInDays;
            };

            function formatDate(dateString) {
                var dateParts = dateString.split('-');
                var day = dateParts[2];
                var month = dateParts[1];
                var year = dateParts[0];
                return year + '-' + month + '-' + day;
            }
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

        <script>
            function calculateTimeDifference() {
                var time1Input = document.getElementById("starttime");
                var time2Input = document.getElementById("endtime");
                var timeDifferenceSpan = document.getElementById("ageing");

                var time1Value = time1Input.value;
                var time2Value = time2Input.value;

                var time1 = new Date("1970-01-01 " + time1Value);
                var time2 = new Date("1970-01-01 " + time2Value);

                var differenceMilliseconds = Math.abs(time2 - time1);
                var differenceMinutes = Math.floor(differenceMilliseconds / 60000);

                timeDifferenceSpan.value = differenceMinutes;
//                alert(timeDifferenceSpan.value);
            }
        </script>

    </body>
</html>

