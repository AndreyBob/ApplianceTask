package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DaoException;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class ApplianceDAOImpl implements ApplianceDAO{
	private static final String PATH_TO_FILE = "resources/appliances_db.txt";
	@Override
	public Appliance find(Criteria criteria) throws DaoException {
		try(BufferedReader reader = new BufferedReader(new FileReader(PATH_TO_FILE))) {
			String lineOfCatalog = "";
			while ((lineOfCatalog = reader.readLine()) != null) {
				if(checkLineCriteria(lineOfCatalog, criteria)) {
					return ApplianceCatalogCreator.createAppliance(lineOfCatalog);
				}
			}

		} catch (IOException e) {
			throw new DaoException(e);
		}
		throw new DaoException();
	}

	private static  boolean checkLineCriteria(String line, Criteria criteria) {
		int numOfCriteria = 0;
		boolean flagOfParams = false;
		String searchNameAppliance = criteria.getGroupSearchName();
		String[] params;
		if (line.contains(searchNameAppliance)) {
			int numOfParams = 0;
			String checkingParams = criteria.getCriteria().toString();
			params = new String[criteria.getCriteria().size()];
			for(Map.Entry entry : criteria.getCriteria().entrySet()) {
				params[numOfParams] = "" + entry.getKey()+ "=" + entry.getValue();
				if (line.contains(params[numOfParams])) {
					numOfCriteria++;
				}
			}
			if (numOfCriteria == params.length) {
				flagOfParams = true;
			} else {
				flagOfParams = false;
			}
		}
		return flagOfParams;
	}

}


