package utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Transforme une date au format String en {@link LocalDateTime}
 * 
 * @param dateStr date au format String
 * @return LocalDateTime
 */
public class DateUtil {
private final static	DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

	public static LocalDateTime toDate(String dateStr) {

		return LocalDateTime.parse(dateStr, FORMATTER);
	}

}
