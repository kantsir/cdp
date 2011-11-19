package com.epam.cdp.mbank.core;

import java.sql.ResultSet;

public abstract class BaseTransformer<T> {

	public abstract T transformTo(ResultSet resultSet);

}
