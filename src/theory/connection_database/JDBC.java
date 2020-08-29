package theory.connection_database;

import java.sql.*;

public class JDBC {
    static Connection con;

    public JDBC() {
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=QLNV;user=sa;password=nguyenvansuong");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void getData() throws SQLException {
        String sql = "SELECT * FROM nhanvien";
        Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            System.out.println(rs.getString(2));

        }
    }

    public void getOutput() throws SQLException {
        /*
         * CREATE PROCEDURE getStaffList
         * @id nvarchar(10), @name nvarchar(50) OUTPUT
         * AS
         *   BEGIN
         *       SELECT id FROM nhanvien WHERE id = @id
         *           set @name = "@Author SuongNguyen"
         *   END
         * */

        CallableStatement cs = con.prepareCall("{call getStaffList(?,?)}");
        cs.setString(1,"PH1010");
        cs.setString(2,"Suong");
        cs.registerOutParameter("name",Types.NVARCHAR);

        ResultSet rs = cs.executeQuery();
        rs.next();
        System.out.println(rs.getString(1));
        System.out.println(cs.getString(2));
    }

    public void usingBatch() throws SQLException {
        String sql1 = "UPDATE nhanvien SET hoten = 'nguyen van s' WHERE id = 'PH1010'";
        String sql2 = "UPDATE nhanvien SET hoten = 'nguyen van a' WHERE id = 'PH2020'";

        Statement st = con.createStatement();
        st.addBatch(sql1);
        st.addBatch(sql2);

        int[] lineExecute = st.executeBatch();

        System.out.println("lineExecute[0] = " + lineExecute[0]);
        System.out.println("lineExecute[0] = " + lineExecute[1]);
    }

    public static void main(String[] args) throws SQLException, InterruptedException {
        JDBC a = new JDBC();
        a.usingBatch();
        a.getData();
    }

}
