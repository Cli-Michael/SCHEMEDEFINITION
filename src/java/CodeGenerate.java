/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author DELL
 */
public class CodeGenerate {

    public static String[] createArrayFromCommaSeparatedString(String input) {
        String[] items = input.split(",");
        for (int i = 0; i < items.length; i++) {
            items[i] = items[i].trim();
        }
        return items;
    }

    public static void generateCodeGetParameter(String[] paramNames) {
        for (int i = 0; i < paramNames.length; i++) {
            String paramName = paramNames[i];
            String statement = "String " + paramName + " = request.getParameter(\"" + paramName + "\");";
            System.out.println(statement);
        }
    }

    public static String generateInsertStatement(String[] arr, String tableName, String[] columnNames) {
        // Generate the output string
        StringBuilder output = new StringBuilder();
        StringBuilder strn = new StringBuilder();
        StringBuilder r_ = new StringBuilder();
        output.append("public static int insert" + tableName + "(");
        for (int i = 0; i < arr.length; i++) {
            output.append("String " + arr[i]);
            strn.append(columnNames[i]);
            r_.append("?");
            if (i < arr.length - 1) {
                output.append(", ");
                strn.append(",");
                r_.append(", ");
            }
        }
        output.append(") {\n");
        output.append("    int status = 0;\n");
        output.append("    try {\n");
        output.append("        Connection con = DB.getConnection();\n");
        output.append("        PreparedStatement ps = con.prepareStatement(\"insert into " + tableName + "(");
        output.append(strn.toString());
        output.append(") values(");
        output.append(r_.toString());
        output.append(");\");\n");
        for (int i = 0; i < arr.length; i++) {
            output.append("        ps.setString(" + (i + 1) + ", " + arr[i] + ");\n");
        }
        output.append("        status = ps.executeUpdate();\n");
        output.append("        con.close();\n");
        output.append("    } catch (Exception e) {\n");
        output.append("        System.out.println(e);\n");
        output.append("    }\n");
        output.append("    return status;\n");
        output.append("}\n");

        return output.toString();
    }

    public static String generateInsertStatement_(String[] arr, String tableName, String[] columnNames) {
        // Generate the output string
        StringBuilder output = new StringBuilder();
        StringBuilder strn = new StringBuilder();
        StringBuilder r_ = new StringBuilder();
        output.append("public static int insert" + tableName + "(");
        for (int i = 0; i < arr.length; i++) {
            output.append("String " + arr[i]);
            strn.append(columnNames[i]);
            r_.append("?");
            if (i < arr.length - 1) {
                output.append(", ");
                strn.append(",");
                r_.append(", ");
            }
        }
        output.append(") {\n");
        output.append("    int status = 0;\n");
        output.append("    try {\n");
        output.append("        Connection con = DB.getConnection();\n");
        output.append("        PreparedStatement ps = con.prepareStatement(\"insert into " + tableName + "(");
        for (int i = 0; i < columnNames.length; i++) {
            output.append(columnNames[i]);
            if (i < columnNames.length - 1) {
                output.append(",");
            }
        }
        output.append(") values(");
        output.append(r_.toString());
        output.append(");\");\n");
        for (int i = 0; i < arr.length; i++) {
            output.append("        ps.setString(" + (i + 1) + ", " + arr[i] + ");\n");
        }
        output.append("        status = ps.executeUpdate();\n");
        output.append("        con.close();\n");
        output.append("    } catch (Exception e) {\n");
        output.append("        System.out.println(e);\n");
        output.append("    }\n");
        output.append("    return status;\n");
        output.append("}\n");

        return output.toString();
    }

//    public static int function_(String[] values, String tableName, String[] columnNames) {
//        int status = 0;
//        try {
//            Connection con = DB.getConnection();
//            String columnList = String.join(",", columnNames);
//            StringBuilder placeholders = new StringBuilder();
//            for (int i = 0; i < columnNames.length - 1; i++) {
//                placeholders.append("?,");
//            }
//            placeholders.append("?");
//            String sql = "INSERT INTO " + tableName + "(" + columnList + ") VALUES(" + placeholders.toString() + ")";
//            PreparedStatement ps = con.prepareStatement(sql);
//            for (int i = 0; i < columnNames.length; i++) {
//                ps.setString(i + 1, values[i]);
//            }
//            status = ps.executeUpdate();
//            con.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return status;
//    }

//    public static int function_2(String[] values, String tableName, String[] columnNames) {
//        int status = 0;
//        try {
//            Connection con = DB.getConnection();
//            String columnList = String.join(",", columnNames);
//            StringBuilder placeholders = new StringBuilder();
//            for (int i = 0; i < columnNames.length - 1; i++) {
//                placeholders.append("?,");
//            }
//            placeholders.append("?");
//            String sql = "INSERT INTO " + tableName + "(" + columnList + ") VALUES(" + placeholders.toString() + ")";
//            PreparedStatement ps = con.prepareStatement(sql);
//            for (int i = 0; i < columnNames.length; i++) {
//                if ((values[i] == null) || (values[i] == "null")) {
//                    ps.setString(i + 1, "");
//                } else {
//                    ps.setString(i + 1, values[i]);
//                }
//            }
//            status = ps.executeUpdate();
//            con.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return status;
//    }

    public static void generateStringArray(String commaSeparatedVars) {
        String[] varNames = commaSeparatedVars.split(",");
        String arrayDecl = "String[] strarray = new String[] { ";
        for (int i = 0; i < varNames.length; i++) {
            arrayDecl += varNames[i].trim();
            if (i < varNames.length - 1) {
                arrayDecl += ", ";
            }
        }
        arrayDecl += " };";
        System.out.println(arrayDecl);;
    }

    public static void ex(String[] columns) {

        for (int i = 0; i < columns.length; i++) {
            String capitalized = columns[i].substring(0, 1).toUpperCase() + columns[i].substring(1);
            columns[i] = capitalized;
        }

        for (int i = 1; i < columns.length; i++) {

            // Generate the code for setting the serial number variable
            String code = "s.set" + columns[i - 1] + "(" + "rs.getString(" + (i) + ")" + ");";

            // Print the generated code
            System.out.println(code);
        }

    }

    public static void main(String args[]) {
        //POST CODE Generator
//        String[] params = {"param1", "param2", "param3"};
//        generateCode(params);

        //List Generator
//        String input = "apple,banana,orange";
//        String[] output = createArrayFromCommaSeparatedString(input);
//        generateCode(output);
//        System.out.println();
//        String[] arr = {"a", "b", "c", "d"};
//        String tableName = "TempTable";
//        String[] columnNames = {"column_a", "column_b", "column_c", "column_d", "column_e"};
//        String generatedFunction = generateInsertStatement_(output, tableName, columnNames);
//        System.out.println(generatedFunction);
//        String columns = "uname,pass,languages,atype";
//        String[] columnNames = createArrayFromCommaSeparatedString(columns);
//        String values = "dealercode,time_,date_,regmonth,regdate,complaintnum,supportstatus,systemstatus,remarks";
//        String[] valuesArray = createArrayFromCommaSeparatedString(values);
////         String[] strarray = new String[] { apple, banana, orange }; to generate this output below code.
//        generateStringArray(values);
//        String uname = "TP";
//        String pass = null;
//        String language = "TEMP";
//        String atype = "DC";
//        String[] strarray = new String[]{uname, pass, language, atype};
//
//        int status = function_2(strarray, "cagent", columnNames);
//        if (status > 0) {
//            System.out.println("Insert Successfull");
//        } else {
//            System.out.println("Insert Failure");
//        }
//         String values = "ponumber,podate,vendor,transportername,vendorcode,polocation,poquantity";
//         String[] valuesArray = createArrayFromCommaSeparatedString(values);
//         
//         generateCodeGetParameter(valuesArray);
//         
        // String values_ = "ponumber,podate,vendor,transportername,vendorcode,polocation,poquantity";
//        String values_ = "vendorsku,aplsku,productdescription,productcategory,subcategory,quantity,unitcost,mrp,totalcost,discount,servingplant";
////         String values = "ponumber,podate,vendor,transportername,vendorcode,polocation,poquantity";
//        String[] valuesArray = createArrayFromCommaSeparatedString(values_);
////         String[] valuesArray_ = createArrayFromCommaSeparatedString(values_);
//        generateCodeGetParameter(valuesArray);
//
//        generateStringArray(values_);
//        String column = "vendorsku,aplsku,productdescription,productcategory,subcategory,quantity,unitcost,mrp,totalcost,discount,servingplant,po,bm";
//        String column = "ticketnumber,statusdrop,statusmessage,stockcheck,appointmentcheck,ordernumber,appointmentnumber,appointmentdate,appointmenttime,orderpunchdate,appointmentrecieveddate,details,invoicenum,invoiceref,docket,invoicedate,docketdate,pickup";
//        generateStringArray(column);
//        String[] valuesArray = createArrayFromCommaSeparatedString(column);
//        ex(valuesArray);
//        generateCodeGetParameter(valuesArray);
   
          String columns = "Region,Division,SchemeLetterReceivedDate,SchemeLetterReceivedTime,SchemeLetterName,SchemeType,Component,SchemeID,AdditionalRequirementDetails,RequestDate,ChangesDate,DifferentRequirementFromUnit,DefineBy,ReasonForNotDefine,Status,DefineTime,StartTime,EndTime,Ageing,Day,SchemeDate,Days,TAT,SchemeDeployed,Checker1Date,Checker1Name,Error,Error_,Solved,ErrorHighlightedByRegion,RegionName,ErrorAccepted,ErrorDescription,HighlightedByOfficerName,HighlightedDate,Rectified,RectificationDate,ResolvingTime,a";
          String[] valuesArray = createArrayFromCommaSeparatedString(columns);
//          generateStringArray(columns);
          ex(valuesArray);
//          generateCodeGetParameter(valuesArray);
//          generateStringArray(columns);
    }
}
