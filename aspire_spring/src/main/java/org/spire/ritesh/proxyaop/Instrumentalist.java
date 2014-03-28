/**
 * 
 */
package org.spire.ritesh.proxyaop;

/**
 * @author Ritesh Kumar
 *         <p>
 *         This class is the Implementation of Performer Interface
 *         </p>
 */
public class Instrumentalist implements Performer {

	private Instrument instrument;

	/**
	 * @return Instrument Object
	 */
	public Instrument getInstrument() {
		return instrument;
	}

	/**
	 * @param instrument
	 */
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.spire.ritesh.proxyaop.Performer#perform()
	 */
	@Override
	public void perform() throws PerformanceException {
		instrument.play();
	}

}
