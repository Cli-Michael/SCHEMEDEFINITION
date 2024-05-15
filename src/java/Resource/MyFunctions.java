package Resource;

import Encryption.BCrypt;
import Model.AllAgents;
import Model.Scheme;
import Model.Users;
import Resource.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DELL
 */
public class MyFunctions {

    public static String[] createArrayFromCommaSeparatedString(String input) {
        String[] items = input.split(",");
        for (int i = 0; i < items.length; i++) {
            items[i] = items[i].trim();
        }
        return items;
    }

    public static int updateColumnIfNotNull(String tableName, String columnName, String columnValue, String idColumnName, String idValue) {
        int i = 0;
        if (columnValue != null) {
            try (Connection conn = DB.getConnection();
                    PreparedStatement stmt = conn.prepareStatement("UPDATE " + tableName + " SET " + columnName + " = ? WHERE " + idColumnName + " = ?")) {
                stmt.setString(1, columnValue);
                stmt.setString(2, idValue);
                i = stmt.executeUpdate();
                System.out.println("Update column if not null; " + stmt.toString());
            } catch (SQLException e) {
                // handle exception
            }
        } else {
            System.out.println("Update column if not null: Null Value ");
        }
        return i;
    }

    public static int universalInsert(String tableName, String[] columnNames, String[] values) {
        int status = 0;
        try {
            Connection con = DB.getConnection();
            String columnList = String.join(",", columnNames);
            StringBuilder placeholders = new StringBuilder();
            for (int i = 0; i < columnNames.length - 1; i++) {
                placeholders.append("?,");
            }
            placeholders.append("?");
            String sql = "INSERT INTO " + tableName + "(" + columnList + ") VALUES(" + placeholders.toString() + ")";
            PreparedStatement ps = con.prepareStatement(sql);
            for (int i = 0; i < columnNames.length; i++) {
                if ((values[i] == null) || (values[i] == "null")) {
                    ps.setString(i + 1, "");
                } else {
                    ps.setString(i + 1, values[i]);
                }
            }
            System.out.println("Universal: " + ps.toString());
            status = ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public static int universalUpdate(String tableName,
            String[] columnsToUpdate,
            String[] newValues,
            String whereColumnName,
            String whereColumnValue) {

        int rowsAffected = 0;

        try {
            // Connect to the database
            Connection conn = DB.getConnection();

            StringBuilder selectSql = new StringBuilder();
            selectSql.append("SELECT ");
            for (int i = 0; i < columnsToUpdate.length; i++) {
                selectSql.append(columnsToUpdate[i]);
                if (i < columnsToUpdate.length - 1) {
                    selectSql.append(", ");
                }
            }
            selectSql.append(" FROM ").append(tableName).append(" WHERE ").append(whereColumnName).append(" = ?");
            PreparedStatement selectStmt = conn.prepareStatement(selectSql.toString());
            selectStmt.setString(1, whereColumnValue);
            ResultSet rs = selectStmt.executeQuery();
            rs.next();

            // Build the SQL update statement dynamically
            StringBuilder updateSql = new StringBuilder();
            updateSql.append("UPDATE ").append(tableName).append(" SET ");
            for (int i = 0; i < columnsToUpdate.length; i++) {
                updateSql.append(columnsToUpdate[i]).append(" = ");
                if (columnsToUpdate[i].equals("agents")) {
                    updateSql.append("CONCAT(").append(columnsToUpdate[i]).append(", ?, ',')");
                } else {
                    updateSql.append("?");
                }
                if (i < columnsToUpdate.length - 1) {
                    updateSql.append(", ");
                }
            }
            updateSql.append(" WHERE ").append(whereColumnName).append(" = ?");
            String sql = updateSql.toString();

            // Prepare the SQL statement with the dynamic values
            PreparedStatement updateStmt = conn.prepareStatement(sql);
            for (int i = 0; i < newValues.length; i++) {
                updateStmt.setString(i + 1, newValues[i]);
            }
            updateStmt.setString(newValues.length + 1, whereColumnValue);

            System.out.println("Query Univeral Update: " + updateStmt);
            // Execute the SQL statement
            rowsAffected = updateStmt.executeUpdate();
            System.out.println(rowsAffected + " rows updated.");

            // Close the database connection
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowsAffected;
    }

    public static List<Scheme> getRegionDivision(String agent) {
        List<Scheme> list = new ArrayList<Scheme>();
        try {
            Connection con = DB.getConnection();
            PreparedStatement ps = null;
            ps = con.prepareStatement("select Region, Division, srno from Scheme where assigned=?;");
            ps.setString(1, agent);
            ResultSet rs = ps.executeQuery();
            System.out.println("Query is (getVendorMaster): " + ps.toString());
//            rs.afterLast();
            while (rs.next()) {
                Scheme e = new Scheme();
                e.setRegion(rs.getString(1));
                e.setDivision(rs.getString(2));
                e.setSrno(rs.getInt(3));
                list.add(e);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    
    public static List<Scheme> getRegionDivision() {
        List<Scheme> list = new ArrayList<Scheme>();
        try {
            Connection con = DB.getConnection();
            PreparedStatement ps = null;
            ps = con.prepareStatement("select Region, Division, srno from Scheme;");
            ResultSet rs = ps.executeQuery();
            System.out.println("Query is (getVendorMaster): " + ps.toString());
//            rs.afterLast();
            while (rs.next()) {
                Scheme e = new Scheme();
                e.setRegion(rs.getString(1));
                e.setDivision(rs.getString(2));
                e.setSrno(rs.getInt(3));
                list.add(e);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    
    public static List<Scheme> getRegionDivisionUnassigned() {
        List<Scheme> list = new ArrayList<Scheme>();
        try {
            Connection con = DB.getConnection();
            PreparedStatement ps = null;
            ps = con.prepareStatement("select Region, Division, srno, assigned from Scheme where assigned='Not Assigned';");
            ResultSet rs = ps.executeQuery();
            System.out.println("Query is (getVendorMaster): " + ps.toString());
//            rs.afterLast();
            while (rs.next()) {
                Scheme e = new Scheme();
                e.setRegion(rs.getString(1));
                e.setDivision(rs.getString(2));
                e.setSrno(rs.getInt(3));
                e.setAssigned(rs.getString(4));
                list.add(e);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public static int deleteSchemeRecord(String srno) {
        int status = 0;
        try {
            Connection con = DB.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from scheme where srno=?");
            ps.setInt(1, Integer.valueOf(srno));
            status = ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public static Scheme getSingleScheme(String srno) {
        Scheme s = new Scheme();
        try {
            Connection con = DB.getConnection();
            PreparedStatement ps = null;
            ps = con.prepareStatement("select Region,Division,SchemeLetterReceivedDate,SchemeLetterReceivedTime,SchemeLetterName,SchemeType,Component,SchemeID,AdditionalRequirementDetails,RequestDate,ChangesDate,DifferentRequirementFromUnit,DefineBy,ReasonForNotDefine,Status,DefineTime,StartTime,EndTime,Ageing,Day,SchemeDate,Days,TAT,SchemeDeployed,Checker1Date,Checker1Name,Error,Error_,Solved,ErrorHighlightedByRegion,RegionName,ErrorAccepted,ErrorDescription,HighlightedByOfficerName,HighlightedDate,Rectified,RectificationDate,ResolvingTime from Scheme where srno=?;");
            ps.setString(1, srno);
            ResultSet rs = ps.executeQuery();
            System.out.println("Query is (getSingleScheme): " + ps.toString());
//            rs.afterLast();
            while (rs.next()) {
                s.setRegion(rs.getString(1));
                s.setDivision(rs.getString(2));
                s.setSchemeLetterReceivedDate(rs.getString(3));
                s.setSchemeLetterReceivedTime(rs.getString(4));
                s.setSchemeLetterName(rs.getString(5));
                s.setSchemeType(rs.getString(6));
                s.setComponent(rs.getString(7));
                s.setSchemeID(rs.getString(8));
                s.setAdditionalRequirementDetails(rs.getString(9));
                s.setRequestDate(rs.getString(10));
                s.setChangesDate(rs.getString(11));
                s.setDifferentRequirementFromUnit(rs.getString(12));
                s.setDefineBy(rs.getString(13));
                s.setReasonForNotDefine(rs.getString(14));
                s.setStatus(rs.getString(15));
                s.setDefineTime(rs.getString(16));
                s.setStartTime(rs.getString(17));
                s.setEndTime(rs.getString(18));
                s.setAgeing(rs.getString(19));
                s.setDay(rs.getString(20));
                s.setSchemeDate(rs.getString(21));
                s.setDays(rs.getString(22));
                s.setTAT(rs.getString(23));
                s.setSchemeDeployed(rs.getString(24));
                s.setChecker1Date(rs.getString(25));
                s.setChecker1Name(rs.getString(26));
                s.setError(rs.getString(27));
                s.setError_(rs.getString(28));
                s.setSolved(rs.getString(29));
                s.setErrorHighlightedByRegion(rs.getString(30));
                s.setRegionName(rs.getString(31));
                s.setErrorAccepted(rs.getString(32));
                s.setErrorDescription(rs.getString(33));
                s.setHighlightedByOfficerName(rs.getString(34));
                s.setHighlightedDate(rs.getString(35));
                s.setRectified(rs.getString(36));
                s.setRectificationDate(rs.getString(37));
                s.setResolvingTime(rs.getString(38));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return s;
    }
    
    public static boolean CheckAgentExist(String uname, String password) {
        boolean status = false;
        String HashPass = null;
        boolean matched = false;
        try {
            Connection con = DB.getConnection();
            HashPass = ReturnHashPassword(uname);
            System.out.println("HP: " + HashPass);
            matched = BCrypt.checkpw(password, HashPass);
            if (matched) {
                PreparedStatement ps = con.prepareStatement("select * from cagent where uname=? and pass=?");
                ps.setString(1, uname);
                ps.setString(2, HashPass);
                ResultSet rs = ps.executeQuery();
                status = rs.next();
                con.close();
            } else {
                return false;
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
    
    public static String ReturnHashPassword(String uname) {

        String HashValue = null;
        ResultSet rst = null;
        try {
            Connection con = DB.getConnection();
            PreparedStatement ps = con.prepareStatement("select pass from cagent where uname=?");
            ps.setString(1, uname);
            rst = ps.executeQuery();

            while (rst.next()) {
                HashValue = rst.getString(1);
//                            System.out.println("HashValue: "+HashValue);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return HashValue;
    }
    
    public static boolean CheckAdminExist(String uname, String password) {
        boolean status = false;
        try {
            Connection con = DB.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from admin where uname=? and pass=?");
            ps.setString(1, uname);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            status = rs.next();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
    
    public static boolean CheckAgentNameExist(String uname) {
        boolean status = false;
        try {
            Connection con = DB.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from cagent where uname=?");
            ps.setString(1, uname);
            ResultSet rs = ps.executeQuery();
            status = rs.next();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
    
    public static int CreateAgent(String uname,
            String pass) {

        int status = 0;
        try {
            Connection con = DB.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into cagent(uname,pass) values(?,?);");
            ps.setString(1, uname);
            ps.setString(2, pass);
            status = ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
    
    public static List<AllAgents> getAllAgents() {
        List<AllAgents> list = new ArrayList<AllAgents>();

        try {
            Connection con = DB.getConnection();
            PreparedStatement ps = con.prepareStatement("select srno,uname from cagent");
            System.out.print("Query: " + ps.toString());
            ResultSet rs = ps.executeQuery();
            // rs.afterLast(); 
            while (rs.next()) {
                AllAgents e = new AllAgents();
                e.setSrno(rs.getInt(1));
                e.setUsername(rs.getString(2));
//                e.setPassword(rs.getString(3));
//                e.setAgentType(rs.getString(5));
                list.add(e);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    
     public static int UpdateAgent(String username,
            String password,
            String info) {
        int status = 0;

        try {
            Connection con = DB.getConnection();
            PreparedStatement ps = con.prepareStatement("update cagent set uname=?,pass=? where srno=?");
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setInt(3, Integer.valueOf(info));
            status = ps.executeUpdate();
//            System.out.print("Query: "+ps.toString()); 
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }
     
      public static Users getAgentById(String id) {
        Users e = new Users();

        try {
            Connection con = DB.getConnection();
            PreparedStatement ps = con.prepareStatement("select uname,pass from cagent where srno=?");
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                e.setUsername(rs.getString(1));
                e.setPassword(rs.getString(2));
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return e;
    }
      
      public static int deleteAgent(String srno) {
        int status = 0;
        try {
            Connection con = DB.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from cagent where srno=?");
            ps.setInt(1, Integer.valueOf(srno));
            status = ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
      
     public static List<Users> getAgents() {
        List<Users> list = new ArrayList<Users>();
        try {
            Connection con = DB.getConnection();
            PreparedStatement ps = null;
            ps = con.prepareStatement("select uname from cagent");
            ResultSet rs = ps.executeQuery();
            System.out.println("Query is (getTickets): " + ps.toString());
            rs.afterLast();
            while (rs.previous()) {
                Users s = new Users();
                s.setUsername(rs.getString(1));
                list.add(s);
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return list;
    }  
     
    public static int countUnAssigned() {

        int count = 0;
        try (Connection connection = Resource.DB.getConnection()) {

            // Prepare the SELECT query
            String query = "SELECT COUNT(*) AS count FROM scheme where assigned = 'Not Assigned'";
            PreparedStatement statement = connection.prepareStatement(query);

            // Execute the prepared statement
            ResultSet resultSet = statement.executeQuery();

            // Retrieve the count
            if (resultSet.next()) {
                count = resultSet.getInt("count");
                System.out.println("Count: " + count);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    } 
    
    public static int countTotal() {

        int count = 0;
        try (Connection connection = Resource.DB.getConnection()) {

            // Prepare the SELECT query
            String query = "SELECT COUNT(*) AS count FROM scheme";
            PreparedStatement statement = connection.prepareStatement(query);

            // Execute the prepared statement
            ResultSet resultSet = statement.executeQuery();

            // Retrieve the count
            if (resultSet.next()) {
                count = resultSet.getInt("count");
                System.out.println("Count: " + count);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    } 
    
    public static int AssignToAgentWithCount(String count_, String agentName) {
        int s = 0;
        int count = Integer.valueOf(count_); // Number of records to assign

        // Establish the database connection
        try (Connection connection = DB.getConnection()) {

            // Step 1: Retrieve the desired number of unassigned records
            String selectQuery = "SELECT srno FROM Scheme WHERE assigned = 'Not Assigned' LIMIT ?";
            PreparedStatement selectStatement = connection.prepareStatement(selectQuery);
            selectStatement.setInt(1, count);
            ResultSet resultSet = selectStatement.executeQuery();

            // Step 2: Assign the retrieved records to the agent
            String updateQuery = "UPDATE Scheme SET assigned = ? WHERE srno = ?";
            PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
            updateStatement.setString(1, agentName);

            while (resultSet.next()) {
                int srno = resultSet.getInt("srno");
                updateStatement.setInt(2, srno);
                s += updateStatement.executeUpdate();
            }

            System.out.println(count + " records assigned to agent " + agentName);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return s;
    }

}
