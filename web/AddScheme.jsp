<%-- 
    Document   : AddScheme
    Created on : 18 May, 2023, 6:26:23 PM
    Author     : DELL
--%>

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

        <!----======== CSS ======== -->
        <link rel="stylesheet" href="css/styles.css" />

        <!----===== Boxicons CSS ===== -->
        <link
            href="https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css"
            rel="stylesheet"
            />

        <title>Form</title>
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
                    <li>Asian Paints - Process Name</li>
                </ul>
            </div>
            <form id="survey-form" action="AddScheme" method="post">
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
                                    id="Region"
                                    class="form-control"
                                    placeholder="Region"
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
                                    id="schemedate"
                                    class="form-control"
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
                                    />
                            </div>
                            <div class="form-group">
                                <label id="schemetype-label" for="schemetype"
                                       ><p><span class="clue">Scheme Type</span></p></label
                                >
                                <input
                                    type="number"
                                    name="SchemeType"
                                    id="schemetype"
                                    class="form-control"
                                    placeholder="Scheme Type"
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
                                    />
                            </div>
                            <div class="form-group">
                                <label id="defineby-label" for="defineby">
                                    <p><span class="clue">Define By</span></p></label
                                >
                                <!--                                    <select
                                                                        id="defineby"
                                                                        name="DefineBy"
                                                                        class="form-control"
                                                                        
                                                                        >
                                                                        <option disabled selected value>Select Here</option>
                                                                        <option value="Yes">Yes</option>
                                                                        <option value="No">No</option>
                                                                    </select>-->

                            </div>
                            <div class="form-group">
                                <label id="reason-label" for="reason">
                                    <p><span class="clue">Reason For Not Define</span></p></label
                                >
                                <input
                                    type="text"
                                    name="ReasonForNotDefine"
                                    id="ReasonForNotDefine"
                                    class="form-control"
                                    placeholder="Reason For Not Define"
                                    />
                                <!--                                    <select id="reason" name="ReasonForNotDefine" class="form-control" >
                                                                        <option disabled selected value>Select Here</option>
                                                                        <option value="Yes">Yes</option>
                                                                        <option value="No">No</option>
                                                                    </select>-->
                            </div>
                            <div class="form-group">
                                <label id="status-label" for="status">
                                    <p><span class="clue">Status</span></p></label
                                >
                                <select id="status" name="Status" class="form-control" >
                                    <option disabled selected value>Select Here</option>
                                    <option value="Yes">Yes</option>
                                    <option value="No">No</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label id="definetime-label" for="definetime"
                                       ><p><span class="clue">Define Time</span></p></label
                                >
                                <input
                                    type="time"
                                    name="DefineTime"
                                    id="definetime"
                                    class="form-control"
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
                                    />
                            </div>
                        </div>
                        <!-- elementsright div  -->
                        <div class="elementsright">
                            <div class="form-group">
                                <label id="day-label" for="day">
                                    <p><span class="clue">Day</span></p></label
                                >
                                <!--                                    <select id="day" name="Day" class="form-control" >
                                                                        <option disabled selected value>Select Here</option>
                                                                        <option value="Yes">Yes</option>
                                                                        <option value="No">No</option>
                                                                    </select>-->
                                <input
                                    type="text"
                                    name="Day"
                                    id="Day"
                                    class="form-control"
                                    placeholder="Day"
                                    />
                            </div>
                            <div class="form-group">
                                <label id="schemedate-label" for="schemedate"
                                       ><p><span class="clue">Scheme Date</span></p></label
                                >
                                <input
                                    type="date"
                                    name="SchemeDate"
                                    id="schemedate"
                                    class="form-control"
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
                                    />
                            </div>
                            <div class="form-group">
                                <label id="schemedeployed-label" for="schemedeployed">
                                    <p><span class="clue">Scheme Deployed</span></p></label
                                >
                                <select
                                    id="schemedeployed"
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
                                    id="checkerdate"
                                    class="form-control"
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
                                    name="Error_"
                                    id="errors"
                                    class="form-control"
                                    placeholder="Error"
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
                                    id="errorhighlighted"
                                    name="ErrorHighlightedByRegion"
                                    class="form-control"

                                    >
                                    <option disabled selected value>Select Here</option>
                                    <option value="Yes">Yes</option>
                                    <option value="No">No</option>
                                </select>
                                
                            </div>
                            <div class="form-group">
                                <label id="regionname-label" for="RegionName"
                                       ><p><span class="clue">Region Name</span></p></label
                                >
                                <input
                                    type="text"
                                    name="RegionName"
                                    id="regionname"
                                    class="form-control"
                                    placeholder="Region Name"
                                    />
                            </div>
                            <div class="form-group">
                                <label id="erroraccepted-label" for="erroraccepted">
                                    <p><span class="clue">Error Accepted</span></p></label
                                >
                                <select
                                    id="erroraccepted"
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
                                    />
                            </div>
                            <div class="form-group">
                                <label id="highlighteddate-label" for="highlighteddate"
                                       ><p><span class="clue">Highlighted Date</span></p></label
                                >
                                <input
                                    type="date"
                                    name="HighlightedDate"
                                    id="highlighteddate"
                                    class="form-control"
                                    />
                            </div>
                            <div class="form-group">
                                <label id="rectified-label" for="rectified">
                                    <p><span class="clue">Rectified</span></p></label
                                >
                                <select
                                    id="rectified"
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
                                    id="rectificationdate"
                                    class="form-control"
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
                                    id="resolvingtime"
                                    class="form-control"
                                    placeholder="Resolving Time"
                                    />
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

