/**
 * @author Mikias Tadele
 * @version 12 December 2024
 */

package edu.augie.finalProgram.tadele;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public interface AirportData {

    // International flights: Mapping of airports to their international destinations
    HashMap<String, List<String>> INTERNATIONAL_FLIGHTS = new HashMap<>() {{
        put("LHR", Arrays.asList("CDG", "FRA", "AMS", "HND", "DXB", "DOH", "IST"));
        put("CDG", Arrays.asList("LHR", "AMS", "SIN", "SYD", "JNB", "GRU", "DEL"));
        put("FRA", Arrays.asList("LHR", "DXB", "HND", "PEK", "SIN", "KUL", "CPT"));
        put("AMS", Arrays.asList("FRA", "LHR", "SYD", "SIN", "DXB", "DOH", "GRU"));
        put("HND", Arrays.asList("LHR", "PEK", "SYD", "SIN", "CDG", "IST", "KUL"));
        put("DXB", Arrays.asList("SIN", "SYD", "HND", "LHR", "CDG", "IST", "GRU"));
        put("SIN", Arrays.asList("DXB", "SYD", "HND", "LHR", "CDG", "PEK", "JNB"));
        put("SYD", Arrays.asList("SIN", "DXB", "PEK", "JNB", "AMS", "KUL", "DEL"));
        put("PEK", Arrays.asList("HND", "LHR", "SIN", "CDG", "SYD", "DOH", "IST"));
        put("JNB", Arrays.asList("SIN", "DXB", "LHR", "CDG", "PEK", "CPT", "GRU"));
        put("DOH", Arrays.asList("IST", "SIN", "DXB", "LHR", "FRA", "GRU", "DEL"));
        put("IST", Arrays.asList("LHR", "SIN", "DXB", "DOH", "AMS", "PEK", "DEL"));
        put("GRU", Arrays.asList("CDG", "LHR", "DOH", "DXB", "CPT", "IST", "SYD"));
        put("DEL", Arrays.asList("LHR", "CDG", "SIN", "DXB", "HND", "IST", "KUL"));
        put("CPT", Arrays.asList("JNB", "GRU", "DXB", "SIN", "SYD", "FRA", "KUL"));
        put("KUL", Arrays.asList("SIN", "HND", "FRA", "CPT", "SYD", "DEL", "DOH"));
    }};

    // List of international airports
    List<String> INTERNATIONAL_AIRPORTS = Arrays.asList(
        "LHR", "CDG", "FRA", "AMS", "HND", "DXB", "SIN", "SYD", "PEK", "JNB", 
        "DOH", "IST", "GRU", "DEL", "CPT", "KUL"
    );

    // Domestic flights: Mapping of airports to their domestic destinations
    HashMap<String, List<String>> DOMESTIC_FLIGHTS = new HashMap<>() {{
        put("EWR", Arrays.asList("SFO", "DFW", "ATL", "LAX", "ORD"));
        put("JFK", Arrays.asList("LAX", "ORD", "MIA", "SEA", "PHX"));
        put("LAX", Arrays.asList("SEA", "SFO", "IAH", "MIA", "BOS"));
        put("SFO", Arrays.asList("LAX", "DFW", "ORD", "SEA", "MIA"));
        put("MIA", Arrays.asList("BOS", "PHX", "LGA", "SEA", "PDX"));
        put("ATL", Arrays.asList("LAX", "DFW", "JFK", "PHX", "IAH"));
        put("ORD", Arrays.asList("LAX", "DFW", "ATL", "SEA", "IAH"));
        put("DFW", Arrays.asList("LAX", "ORD", "MIA", "JFK", "BOS"));
        put("DEN", Arrays.asList("PHX", "SFO", "LAX", "MSP", "DTW"));
        put("LAS", Arrays.asList("SEA", "LAX", "JFK", "ORD", "BOS"));
        put("SEA", Arrays.asList("LAX", "SFO", "PDX", "MIA", "JFK"));
        put("CLT", Arrays.asList("DFW", "ATL", "LAX", "MIA", "PHX"));
        put("IAH", Arrays.asList("LAX", "DFW", "ORD", "SEA", "MIA"));
        put("PHX", Arrays.asList("LAX", "DFW", "SEA", "ORD", "ATL"));
        put("MSP", Arrays.asList("PHX", "SEA", "ORD", "LAX", "IAH"));
        put("DTW", Arrays.asList("ORD", "SEA", "LAX", "MIA", "BOS"));
        put("BOS", Arrays.asList("LAX", "ORD", "MIA", "PHX", "SEA"));
        put("LGA", Arrays.asList("ORD", "DFW", "MIA", "BOS", "SEA"));
        put("MDW", Arrays.asList("LAX", "ORD", "DFW", "SEA", "PHX"));
        put("PDX", Arrays.asList("SEA", "LAX", "DFW", "MIA", "BOS"));
        put("HOU", Arrays.asList("LAX", "ORD", "PHX", "ATL", "MIA"));
    }};

    // List of domestic airports
    List<String> DOMESTIC_AIRPORTS = Arrays.asList(
        "ATL", "LAX", "ORD", "DFW", "DEN", "JFK", "SFO", "LAS", "SEA", "MIA",
        "EWR", "CLT", "IAH", "PHX", "MSP", "DTW", "BOS", "LGA", "MDW", "PDX", "HOU"
    );
}
