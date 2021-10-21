/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package io.m9rcy.dto;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class PersonDto extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 237636488436074398L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PersonDto\",\"namespace\":\"io.m9rcy.dto\",\"fields\":[{\"name\":\"firstName\",\"type\":\"string\",\"doc\":\"the first name of a person\"},{\"name\":\"lastName\",\"type\":\"string\",\"doc\":\"the last name of a person\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<PersonDto> ENCODER =
      new BinaryMessageEncoder<PersonDto>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<PersonDto> DECODER =
      new BinaryMessageDecoder<PersonDto>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<PersonDto> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<PersonDto> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<PersonDto> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<PersonDto>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this PersonDto to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a PersonDto from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a PersonDto instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static PersonDto fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** the first name of a person */
   private java.lang.CharSequence firstName;
  /** the last name of a person */
   private java.lang.CharSequence lastName;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public PersonDto() {}

  /**
   * All-args constructor.
   * @param firstName the first name of a person
   * @param lastName the last name of a person
   */
  public PersonDto(java.lang.CharSequence firstName, java.lang.CharSequence lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return firstName;
    case 1: return lastName;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: firstName = (java.lang.CharSequence)value$; break;
    case 1: lastName = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'firstName' field.
   * @return the first name of a person
   */
  public java.lang.CharSequence getFirstName() {
    return firstName;
  }


  /**
   * Sets the value of the 'firstName' field.
   * the first name of a person
   * @param value the value to set.
   */
  public void setFirstName(java.lang.CharSequence value) {
    this.firstName = value;
  }

  /**
   * Gets the value of the 'lastName' field.
   * @return the last name of a person
   */
  public java.lang.CharSequence getLastName() {
    return lastName;
  }


  /**
   * Sets the value of the 'lastName' field.
   * the last name of a person
   * @param value the value to set.
   */
  public void setLastName(java.lang.CharSequence value) {
    this.lastName = value;
  }

  /**
   * Creates a new PersonDto RecordBuilder.
   * @return A new PersonDto RecordBuilder
   */
  public static io.m9rcy.dto.PersonDto.Builder newBuilder() {
    return new io.m9rcy.dto.PersonDto.Builder();
  }

  /**
   * Creates a new PersonDto RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new PersonDto RecordBuilder
   */
  public static io.m9rcy.dto.PersonDto.Builder newBuilder(io.m9rcy.dto.PersonDto.Builder other) {
    if (other == null) {
      return new io.m9rcy.dto.PersonDto.Builder();
    } else {
      return new io.m9rcy.dto.PersonDto.Builder(other);
    }
  }

  /**
   * Creates a new PersonDto RecordBuilder by copying an existing PersonDto instance.
   * @param other The existing instance to copy.
   * @return A new PersonDto RecordBuilder
   */
  public static io.m9rcy.dto.PersonDto.Builder newBuilder(io.m9rcy.dto.PersonDto other) {
    if (other == null) {
      return new io.m9rcy.dto.PersonDto.Builder();
    } else {
      return new io.m9rcy.dto.PersonDto.Builder(other);
    }
  }

  /**
   * RecordBuilder for PersonDto instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PersonDto>
    implements org.apache.avro.data.RecordBuilder<PersonDto> {

    /** the first name of a person */
    private java.lang.CharSequence firstName;
    /** the last name of a person */
    private java.lang.CharSequence lastName;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.m9rcy.dto.PersonDto.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.firstName)) {
        this.firstName = data().deepCopy(fields()[0].schema(), other.firstName);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.lastName)) {
        this.lastName = data().deepCopy(fields()[1].schema(), other.lastName);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing PersonDto instance
     * @param other The existing instance to copy.
     */
    private Builder(io.m9rcy.dto.PersonDto other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.firstName)) {
        this.firstName = data().deepCopy(fields()[0].schema(), other.firstName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.lastName)) {
        this.lastName = data().deepCopy(fields()[1].schema(), other.lastName);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'firstName' field.
      * the first name of a person
      * @return The value.
      */
    public java.lang.CharSequence getFirstName() {
      return firstName;
    }


    /**
      * Sets the value of the 'firstName' field.
      * the first name of a person
      * @param value The value of 'firstName'.
      * @return This builder.
      */
    public io.m9rcy.dto.PersonDto.Builder setFirstName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.firstName = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'firstName' field has been set.
      * the first name of a person
      * @return True if the 'firstName' field has been set, false otherwise.
      */
    public boolean hasFirstName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'firstName' field.
      * the first name of a person
      * @return This builder.
      */
    public io.m9rcy.dto.PersonDto.Builder clearFirstName() {
      firstName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'lastName' field.
      * the last name of a person
      * @return The value.
      */
    public java.lang.CharSequence getLastName() {
      return lastName;
    }


    /**
      * Sets the value of the 'lastName' field.
      * the last name of a person
      * @param value The value of 'lastName'.
      * @return This builder.
      */
    public io.m9rcy.dto.PersonDto.Builder setLastName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.lastName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'lastName' field has been set.
      * the last name of a person
      * @return True if the 'lastName' field has been set, false otherwise.
      */
    public boolean hasLastName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'lastName' field.
      * the last name of a person
      * @return This builder.
      */
    public io.m9rcy.dto.PersonDto.Builder clearLastName() {
      lastName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public PersonDto build() {
      try {
        PersonDto record = new PersonDto();
        record.firstName = fieldSetFlags()[0] ? this.firstName : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.lastName = fieldSetFlags()[1] ? this.lastName : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<PersonDto>
    WRITER$ = (org.apache.avro.io.DatumWriter<PersonDto>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<PersonDto>
    READER$ = (org.apache.avro.io.DatumReader<PersonDto>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.firstName);

    out.writeString(this.lastName);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.firstName = in.readString(this.firstName instanceof Utf8 ? (Utf8)this.firstName : null);

      this.lastName = in.readString(this.lastName instanceof Utf8 ? (Utf8)this.lastName : null);

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.firstName = in.readString(this.firstName instanceof Utf8 ? (Utf8)this.firstName : null);
          break;

        case 1:
          this.lastName = in.readString(this.lastName instanceof Utf8 ? (Utf8)this.lastName : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










