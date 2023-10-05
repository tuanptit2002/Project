package com.example.giasu.Repository;

import com.example.giasu.Entity.Class;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository

public interface ClassRepository extends JpaRepository<Class, Long> {

    @Query(value = "select c.id, c.describes, c.districts, c.price, c.request,c.district_id, c.user_id, " +
            "c.information, c.number_sessions, c.time_teach, c.city_id, c.levelschool_id from class  as c inner join " +
            "district as dt on (c.district_id = dt.id) " +
            "inner join city as ct on (ct.id = c.city_id) inner join level_school as ls on (ls.id = c.levelschool_id)" +
            "inner join `class-teach_class` as ctc on(c.id = ctc.class_id) " +
            "inner join teach_class as ts on (ts.id = ctc.teach_class_id) inner join class-subject as cs on (c.id = cs.class_id)" +
            "inner join subject as sb on(cs.subject_id = sb.id)" +
            "where (?1 is null or c.id = ?1) and " +
            "(?2 is null or c.describes like concat('%', ?2, '%')) " +
            "and (?3 is null or ct.id = ?3) and " +
            "(?4 is null or dt.id = ?4) and " +
            "(?5 is null or c.request like concat('%',?5,'%')) and " +
            "(?6 is null or c.request like concat('%',?6,'%')) and " +
            "(?7 is null or ls.id = ?7) and " +
            "(?8 is null or ts.id = ?8) and (?9 is null or sb.id = ?9)"
            , nativeQuery = true,
            countQuery = "select count(*) from class  as c inner join district as dt on (c.district_id = dt.id) " +
                    "inner join city as ct on (ct.id = c.city_id) " +
                    "inner join level_school as ls on (ls.id = c.levelschool_id) " +
                    "inner join `class-teach_class` as ctc on(c.id = ctc.class_id) " +
                    "inner join teach_class as ts on (ts.id = ctc.teach_class_id) " +
                    "where (?1 is null or c.id = ?1)" +
                    " and ?2 is null or c.describes like concat('%', ?2, '%') " +
                    "and (?3 is null or ct.id = ?3) and (?4 is null or dt.id = ?4) " +
                    "and (?5 is null or c.request like concat('%',?5,'%')) " +
                    "and (?6 is null or c.request like concat('%',?6,'%'))and (?7 is null or ls.id = ?7) and (?8 is null or ts.id = ?8) and (?9 is null or sb.id = ?9)")
    Page<Class> findClass(Pageable pageable, Long id_class, String describes, Long id_city,
                          Long id_district, String requestLevel, String requestSex, Long id_levelSchool, Long classRoom,Long subject);
}
