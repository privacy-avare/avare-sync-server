/*
 * Copyright 2017 Lukas Struppek.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.privacy_avare.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Tritt auf, wenn beim Push-Versuch der Preferences des Client diese hinsichtlich des
 * Zeitpunktes lastProfileChange veraltet sind im Vergleich mit dem DB-Profil und ein
 * Überschreiben des DB-Profils ausgeschlossen wurde.
 * 
 * Der HTTP-Statuscode entspricht 409 Conflict.
 * 
 * @author Lukas Struppek
 * @version 1.0
 * @see RuntimeException
 *
 */

@ResponseStatus(HttpStatus.CONFLICT)
public class ClientPreferencesOutdatedException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	/**
	 * Default-Konstruktor, welcher den entsprechenden parameterlosen
	 * Superkonstruktor von Runtime aufruft.
	 */
	public ClientPreferencesOutdatedException() {
		super();
	}

	/**
	 * Ruft den Superkonstruktor von RutimeException auf.
	 * @param message Beschreibung des Fehlers.
	 */
	public ClientPreferencesOutdatedException(String message) {
		super(message);
	}

	/**
	 * Ruft den Superkonstruktor von RutimeException.
	 * @param message Beschreibung des Fehlers.
	 * @param cause Grund des Fehlerauftritts.
	 */
	public ClientPreferencesOutdatedException(String message, Throwable cause) {
		super(message, cause);
	}
}
