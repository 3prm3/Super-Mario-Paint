package smp.components;

import smp.components.staff.sequences.Note;

/**
 * A "constants" file for holding things like default
 * window size, default modes, etc. These values may change
 * over the operation of the program.
 * @author RehdBlob
 * @since 2012.08.14
 */
public class Values {

    /** Default width */
    public static final int DEFAULT_WIDTH = 805;

    /** Default height */
    public static final int DEFAULT_HEIGHT = 635;

    /**
     * The largest value that a note velocity can be;
     * a note played at this will be played as loudly
     * as possible.
     */
    public static final int MAX_VELOCITY = 127;

    /**
     * The median value that a note velocity can be. This
     * should be the half-volume level.
     */
    public static final int HALF_VELOCITY = 64;

    /**
     * This is the smallest value a note velocity can be.
     */
    public static final int ZERO_VELOCITY = 0;

    /**
     * The smallest value that a note velocity can be;
     * a note will basically be silent if played at this.
     */
    public static int MIN_VELOCITY = 0;

    /**
     * The default volume that we will be playing notes at. This
     * can be changed over the course of the use of this program.
     */
    public static int DEFAULT_VELOCITY = 96;

    /**
     * The number of distinct steps of notes in a note line on the staff.
     * This number is typically 18.
     */
    public static int NOTES_IN_A_LINE = 18;

    /**
     * The number of distinct lines of notes that exist on the staff. This
     * number is typically 10.
     */
    public static int NOTELINES_IN_THE_WINDOW = 10;

    /** The number of beats in each measure, by default. */
    public static int DEFAULT_TIMESIG_BEATS = 4;

    /**
     * The number of lines in the staff, by default. This number
     * is typically 384.
     */
    public static int DEFAULT_LINES_PER_SONG = 384;

    /**
     * The amount of time the mouse must be held before we start repeating
     * clicks.
     */
    public static int HOLDTIME = 250;

    /** The amount of time between the repetition of two mouse click events. */
    public static int REPEATTIME = 10;

    /** The number of tracks in the Mario Paint Composer song. */
    public static final int NUM_TRACKS = 19;

    /** The MIDI control channel for modulation. */
    public static final int MODULATION = 0x1;

    /** The MIDI control channel for volume. */
    public static final int VOLUME = 0x7;

    /** The MIDI control channel for pan. */
    public static final int PAN = 0xA;

    /** The MIDI control channel for sustain pedal. */
    public static final int SUSTAIN = 0x40;

    /** The MIDI control channel for reverb. */
    public static final int REVERB = 0x5B;

    /** The MIDI control channel for chorus. */
    public static final int CHORUS = 0x5D;

    /** The number of MIDI channels that exist. */
    public static final int MIDICHANNELS = 16;

    /** The channel that is reserved for drums in MIDI. */
    public static final int DRUMCHANNEL = 10;

    /** Array of notes that we can see on the staff. */
    public static final Note[] staffNotes = {
        Note.A2, Note.B2, Note.C3, Note.D3, Note.E3, Note.F3, Note.G3,
        Note.A3, Note.B3, Note.C4, Note.D4, Note.E4, Note.F4, Note.G4,
        Note.A4, Note.B4, Note.C5, Note.D5};
}