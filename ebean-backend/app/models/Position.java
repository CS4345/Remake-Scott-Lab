package models;

import com.avaje.ebean.ExpressionList;
import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.*;
import java.sql.*;

@Entity
public class Position extends Model {
    private static final long serialVersionUID = 1L;

    @Id
    public Long position_id;

    @Constraints.Required
    public String courseTitle;

    @Constraints.Required
    public String faculty;

    @Constraints.Required
    public String pay;

    @Constraints.Required
    public String hours;

    public static Find<Long, Position> find = new Find<Long, Position>(){};

    public static Position findByPay(String pay) {
        return Position.find
                .where()
                .eq("pay", pay)
                .findUnique();
    }
    public static Position findByFaculty(String faculty) {
        return Position.find
                .where()
                .eq("faculty", faculty)
                .findUnique();
    }
    public static Position findByCourseTitle(String courseTitle) {
        return Position.find
                .where()
                .eq("courseTitle", courseTitle)
                .findUnique();
    }
    public static List<Position> getAllPositions() throws SQLException {
        List<Position> positions = new ArrayList<>();

        // Establish database connection
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/CS4345", "root", "toor");

        // Query the position table and fetch all positions
        String sql = "SELECT * FROM position";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        // Iterate through the result set and create Position objects
        while (rs.next()) {
            long id = rs.getLong("position_id");
            String title = rs.getString("course_title");
            String faculty = rs.getString("faculty");
            String pay = rs.getString("pay");
            String hours = rs.getString("hours");

            Position position = new Position();
            position.position_id = id;
            position.courseTitle = title;
            position.faculty = faculty;
            position.pay = pay;
            position.hours = hours;
            positions.add(position);
        }

        // Close database resources
        rs.close();
        stmt.close();
        conn.close();

        return positions;
    }
}
