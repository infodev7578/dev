/*
 * Created on 20 févr. 2017 ( Time 04:16:10 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package fr.eugena.webservice.rest.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import fr.eugena.webservice.rest.bean.Collaborateur;
import fr.eugena.webservice.rest.bean.HistoConge;
import fr.eugena.webservice.rest.dao.GenericDAO;
import fr.eugena.webservice.rest.dao.HistoCongeDAO;
import fr.eugena.webservice.rest.io.CompteurConge;

/**
 * HistoConge DAO implementation
 * 
 * @author Telosys Tools
 *
 */
@Repository
public class HistoCongeDAOImplSpring extends GenericDAO<HistoConge> implements
		HistoCongeDAO {

	private final static String SQL_SELECT = "select id_histo_conge, fk_id_collaborateur, fk_id_type_conge, nb_jours, date_creation from Histo_conge where id_histo_conge = ?";

	private final static String SQL_INSERT = "insert into Histo_conge ( id_histo_conge, fk_id_collaborateur, fk_id_type_conge, nb_jours, date_creation ) values ( ?, ?, ?, ?, ? )";

	private final static String SQL_UPDATE = "update Histo_conge set fk_id_collaborateur = ?, fk_id_type_conge = ?, nb_jours = ?, date_creation = ? where id_histo_conge = ?";

	private final static String SQL_DELETE = "delete from Histo_conge where id_histo_conge = ?";

	private final static String SQL_COUNT_ALL = "select count(*) from Histo_conge";

	private final static String SQL_COUNT = "select count(*) from Histo_conge where id_histo_conge = ?";

	private final static String SQL_SELECT_GROUP_BY_TYPE = "select type_cong.code, count(1) as nombre from Histo_conge histo "
			+ "inner join Type_conge type_cong on (type_cong.id_type_conge = histo.fk_id_type_conge) "
			+ "where histo.fk_id_collaborateur = ? "
			+ "group by type_cong.code ";

	// ----------------------------------------------------------------------
	/**
	 * DAO constructor
	 */
	public HistoCongeDAOImplSpring() {
		super();
	}

	// ----------------------------------------------------------------------
	/*
	 * (non-Javadoc) DAO interface implementation
	 */
	@Override
	public HistoConge find(Integer idHistoConge) {
		Object[] primaryKey = new Object[] { idHistoConge };
		return super.doSelect(primaryKey);
	}

	// ----------------------------------------------------------------------
	/*
	 * (non-Javadoc) DAO interface implementation
	 */
	@Override
	public boolean load(HistoConge histoConge) {
		return super.doSelect(histoConge);
	}

	// ----------------------------------------------------------------------
	/*
	 * (non-Javadoc) DAO interface implementation
	 */
	@Override
	public void insert(HistoConge histoConge) {
		super.doInsert(histoConge);
	}

	// ----------------------------------------------------------------------
	/*
	 * (non-Javadoc) DAO interface implementation
	 */
	@Override
	public int update(HistoConge histoConge) {
		return super.doUpdate(histoConge);
	}

	// ----------------------------------------------------------------------
	/*
	 * (non-Javadoc) DAO interface implementation
	 */
	@Override
	public int delete(Integer idHistoConge) {
		Object[] primaryKey = new Object[] { idHistoConge };
		return super.doDelete(primaryKey);
	}

	// ----------------------------------------------------------------------
	/*
	 * (non-Javadoc) DAO interface implementation
	 */
	@Override
	public int delete(HistoConge histoConge) {
		return super.doDelete(histoConge);
	}

	// ----------------------------------------------------------------------
	/*
	 * (non-Javadoc) DAO interface implementation
	 */
	@Override
	public boolean exists(Integer idHistoConge) {
		Object[] primaryKey = new Object[] { idHistoConge };
		return super.doExists(primaryKey);
	}

	// ----------------------------------------------------------------------
	/*
	 * (non-Javadoc) DAO interface implementation
	 */
	@Override
	public boolean exists(HistoConge histoConge) {
		return super.doExists(histoConge);
	}

	// ----------------------------------------------------------------------
	/*
	 * (non-Javadoc) DAO interface implementation
	 */
	@Override
	public long count() {
		return super.doCountAll();
	}

	// ----------------------------------------------------------------------
	// Super class abstract methods implementation
	// ----------------------------------------------------------------------
	@Override
	protected String getSqlSelect() {
		return SQL_SELECT;
	}

	// ----------------------------------------------------------------------
	@Override
	protected String getSqlInsert() {
		return SQL_INSERT;
	}

	// ----------------------------------------------------------------------
	@Override
	protected String getSqlUpdate() {
		return SQL_UPDATE;
	}

	// ----------------------------------------------------------------------
	@Override
	protected String getSqlDelete() {
		return SQL_DELETE;
	}

	// ----------------------------------------------------------------------
	@Override
	protected String getSqlCount() {
		return SQL_COUNT;
	}

	// ----------------------------------------------------------------------
	@Override
	protected String getSqlCountAll() {
		return SQL_COUNT_ALL;
	}

	// ----------------------------------------------------------------------
	@Override
	protected Object[] getValuesForInsert(HistoConge histoConge) {
		return new Object[] {
				// --- Returns PRIMARY KEY and DATA ( for SQL
				// "SET x=?, y=?, ..." )
				histoConge.getIdHistoConge(), // "id_histo_conge" :
												// java.lang.Integer
				histoConge.getFkIdCollaborateur(), // "fk_id_collaborateur" :
													// java.lang.Integer
				histoConge.getFkIdTypeConge(), // "fk_id_type_conge" :
												// java.lang.Integer
				histoConge.getNbJours(), // "nb_jours" : java.lang.Integer
				histoConge.getDateCreation() // "date_creation" : java.util.Date
		};
	}

	// ----------------------------------------------------------------------
	@Override
	protected Object[] getValuesForUpdate(HistoConge histoConge) {
		return new Object[] {
				// --- Returns DATA first ( for SQL "SET x=?, y=?, ..." )
				histoConge.getFkIdCollaborateur(), // "fk_id_collaborateur" :
													// java.lang.Integer
				histoConge.getFkIdTypeConge(), // "fk_id_type_conge" :
												// java.lang.Integer
				histoConge.getNbJours(), // "nb_jours" : java.lang.Integer
				histoConge.getDateCreation(), // "date_creation" :
												// java.util.Date
				// --- Returns PRIMARY KEY at the end ( for SQL
				// "WHERE key=?, ..." )
				histoConge.getIdHistoConge() // "id_histo_conge" :
												// java.lang.Integer
		};
	}

	// ----------------------------------------------------------------------
	@Override
	protected Object[] getValuesForPrimaryKey(HistoConge histoConge) {
		return new Object[] {
		// --- Returns PRIMARY KEY values ( for SQL "WHERE key=?, ..." )
		histoConge.getIdHistoConge() // "id_histo_conge" : java.lang.Integer
		};
	}

	// ----------------------------------------------------------------------
	@Override
	protected RowMapper<HistoConge> getRowMapper(HistoConge o) {
		// --- RowMapper to populate the given bean instance
		return new HistoCongeRowMapper(o);
	}

	// ----------------------------------------------------------------------
	@Override
	protected RowMapper<HistoConge> getRowMapper() {
		// --- RowMapper to populate a new bean instance
		return new HistoCongeRowMapper(new HistoConge());
	}

	// ----------------------------------------------------------------------
	/**
	 * Populates the given bean with the data retrieved from the given ResultSet
	 * 
	 * @param rs
	 * @param histoConge
	 * @throws SQLException
	 */
	private void populateBean(ResultSet rs, HistoConge histoConge)
			throws SQLException {

		// --- Set data from ResultSet to Bean attributes
		histoConge.setIdHistoConge(rs.getInt("id_histo_conge")); // java.lang.Integer
		if (rs.wasNull()) {
			histoConge.setIdHistoConge(null);
		}
		; // not primitive number => keep null value if any
		histoConge.setFkIdCollaborateur(rs.getInt("fk_id_collaborateur")); // java.lang.Integer
		if (rs.wasNull()) {
			histoConge.setFkIdCollaborateur(null);
		}
		; // not primitive number => keep null value if any
		histoConge.setFkIdTypeConge(rs.getInt("fk_id_type_conge")); // java.lang.Integer
		if (rs.wasNull()) {
			histoConge.setFkIdTypeConge(null);
		}
		; // not primitive number => keep null value if any
		histoConge.setNbJours(rs.getInt("nb_jours")); // java.lang.Integer
		if (rs.wasNull()) {
			histoConge.setNbJours(null);
		}
		; // not primitive number => keep null value if any
		histoConge.setDateCreation(rs.getDate("date_creation")); // java.util.Date
	}

	// ----------------------------------------------------------------------
	/**
	 * Specific inner class for 'RowMapper' implementation
	 */
	private class HistoCongeRowMapper implements RowMapper<HistoConge> {

		/**
		 * The bean instance that will be populated from the ResultSet
		 */
		private final HistoConge bean;

		/**
		 * Constructor
		 * 
		 * @param bean
		 *            the bean to be populated
		 */
		HistoCongeRowMapper(HistoConge bean) {
			this.bean = bean;
		}

		@Override
		public HistoConge mapRow(ResultSet rs, int rowNum) throws SQLException {
			populateBean(rs, this.bean);
			return this.bean;
		}
	}

	@Override
	public List<CompteurConge> findByTypeConge(Collaborateur collaborateur) {
		JdbcTemplate jdbcTemplate = getJdbcTemplate();
		// --- Try to find the record. NB : Spring throws
		// "EmptyResultDataAccessException" if not found
		try {
			return jdbcTemplate.query(SQL_SELECT_GROUP_BY_TYPE,
					new Object[] { collaborateur.getIdCollaborateur() },
					new BeanPropertyRowMapper<CompteurConge>(
							CompteurConge.class));
		} catch (EmptyResultDataAccessException e) {
			// Nothing to do, just return null
			return null;
		}
	}

}