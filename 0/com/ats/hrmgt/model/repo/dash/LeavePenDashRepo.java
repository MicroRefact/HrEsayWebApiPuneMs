import com.ats.hrmgt.model.dashboard.LeavePenDash;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
public interface LeavePenDashRepo extends JpaRepository<LeavePenDash, String> {


@Query(value = "SELECT\n" + "        UUID() as uni_key,\n" + "        (     SELECT\n" + "            COUNT(lv.leave_id)              \n" + "        FROM\n" + "            leave_apply lv,m_employees e              \n" + "        WHERE\n" + "            lv.ex_int1 = 1              \n" + "            AND lv.del_status = 1 and e.emp_id=lv.emp_id and e.location_id=:locId) AS new_app,\n" + "        (     SELECT\n" + "            COUNT(lv1.leave_id)              \n" + "        FROM\n" + "            leave_apply lv1,m_employees e               \n" + "        WHERE\n" + "            lv1.ex_int1 = 2              \n" + "            AND lv1.del_status = 1 and e.emp_id=lv1.emp_id and e.location_id=:locId) AS final_pending,\n" + "        (     SELECT\n" + "            COUNT('')              \n" + "        FROM\n" + "            t_optional_holiday oh,m_employees e              \n" + "        WHERE\n" + "            oh.status = 0 and e.emp_id=oh.emp_id and e.location_id=:locId) AS oh_pending," + "		(     SELECT\n" + "            COUNT(lv.ca_head_id)                       \n" + "        FROM\n" + "            claim_apply_header lv,\n" + "            m_employees e                       \n" + "        WHERE\n" + "            lv.del_status = 1 \n" + "            and e.emp_id=lv.emp_id \n" + "            and e.location_id=:locId\n" + "            and lv.claim_status=1) AS new_claim_app,\n" + "        (     SELECT\n" + "            COUNT(lv.ca_head_id)                       \n" + "        FROM\n" + "            claim_apply_header lv,\n" + "            m_employees e                       \n" + "        WHERE\n" + "            lv.del_status = 1 \n" + "            and e.emp_id=lv.emp_id \n" + "            and e.location_id=:locId\n" + "            and lv.claim_status=2) AS final_claim_app", nativeQuery = true)
public LeavePenDash getLeaveCnt(int locId)


}