package com.test1;

public class FlatPickerStructure {
	private Integer recordKey;
	private Integer flatFilePickerCode;
	private String flatFilePickerCodePosition;
	private String flatFilePickerCodeLength;
	private String fileCheckSumDigitsPosition;
	private String fileCheckSumDigitsLength;
	private boolean checksumIdentifierPosition;
	private String checksumIdentifierLength;
	private String sourceAppIdPosition;
	private String sourceAppIdLength;
	private String hostIdentifier;
	private String hostPushAPIConfig;
	private String footerContent;
	private String showCount;

	public FlatPickerStructure() {

	}

	public FlatPickerStructure(Integer recordKey, Integer flatFilePickerCode, String flatFilePickerCodePosition,
			String flatFilePickerCodeLength, String fileCheckSumDigitsPosition, String fileCheckSumDigitsLength,
			boolean checksumIdentifierPosition, String checksumIdentifierLength, String sourceAppIdPosition,
			String sourceAppIdLength, String hostIdentifier, String hostPushAPIConfig, String footerContent,
			String showCount) {
		super();
		this.recordKey = recordKey;
		this.flatFilePickerCode = flatFilePickerCode;
		this.flatFilePickerCodePosition = flatFilePickerCodePosition;
		this.flatFilePickerCodeLength = flatFilePickerCodeLength;
		this.fileCheckSumDigitsPosition = fileCheckSumDigitsPosition;
		this.fileCheckSumDigitsLength = fileCheckSumDigitsLength;
		this.checksumIdentifierPosition = checksumIdentifierPosition;
		this.checksumIdentifierLength = checksumIdentifierLength;
		this.sourceAppIdPosition = sourceAppIdPosition;
		this.sourceAppIdLength = sourceAppIdLength;
		this.hostIdentifier = hostIdentifier;
		this.hostPushAPIConfig = hostPushAPIConfig;
		this.footerContent = footerContent;
		this.showCount = showCount;
	}

	public Integer getRecordKey() {
		return recordKey;
	}

	public void setRecordKey(Integer recordKey) {
		this.recordKey = recordKey;
	}

	public Integer getFlatFilePickerCode() {
		return flatFilePickerCode;
	}

	public void setFlatFilePickerCode(Integer flatFilePickerCode) {
		this.flatFilePickerCode = flatFilePickerCode;
	}

	public String getFlatFilePickerCodePosition() {
		return flatFilePickerCodePosition;
	}

	public void setFlatFilePickerCodePosition(String flatFilePickerCodePosition) {
		this.flatFilePickerCodePosition = flatFilePickerCodePosition;
	}

	public String getFlatFilePickerCodeLength() {
		return flatFilePickerCodeLength;
	}

	public void setFlatFilePickerCodeLength(String flatFilePickerCodeLength) {
		this.flatFilePickerCodeLength = flatFilePickerCodeLength;
	}

	public String getFileCheckSumDigitsPosition() {
		return fileCheckSumDigitsPosition;
	}

	public void setFileCheckSumDigitsPosition(String fileCheckSumDigitsPosition) {
		this.fileCheckSumDigitsPosition = fileCheckSumDigitsPosition;
	}

	public String getFileCheckSumDigitsLength() {
		return fileCheckSumDigitsLength;
	}

	public void setFileCheckSumDigitsLength(String fileCheckSumDigitsLength) {
		this.fileCheckSumDigitsLength = fileCheckSumDigitsLength;
	}

	public boolean isChecksumIdentifierPosition() {
		return checksumIdentifierPosition;
	}

	public void setChecksumIdentifierPosition(boolean checksumIdentifierPosition) {
		this.checksumIdentifierPosition = checksumIdentifierPosition;
	}

	public String getChecksumIdentifierLength() {
		return checksumIdentifierLength;
	}

	public void setChecksumIdentifierLength(String checksumIdentifierLength) {
		this.checksumIdentifierLength = checksumIdentifierLength;
	}

	public String getSourceAppIdPosition() {
		return sourceAppIdPosition;
	}

	public void setSourceAppIdPosition(String sourceAppIdPosition) {
		this.sourceAppIdPosition = sourceAppIdPosition;
	}

	public String getSourceAppIdLength() {
		return sourceAppIdLength;
	}

	public void setSourceAppIdLength(String sourceAppIdLength) {
		this.sourceAppIdLength = sourceAppIdLength;
	}

	public String getHostIdentifier() {
		return hostIdentifier;
	}

	public void setHostIdentifier(String hostIdentifier) {
		this.hostIdentifier = hostIdentifier;
	}

	public String getHostPushAPIConfig() {
		return hostPushAPIConfig;
	}

	public void setHostPushAPIConfig(String hostPushAPIConfig) {
		this.hostPushAPIConfig = hostPushAPIConfig;
	}

	public String getFooterContent() {
		return footerContent;
	}

	public void setFooterContent(String footerContent) {
		this.footerContent = footerContent;
	}

	public String getShowCount() {
		return showCount;
	}

	public void setShowCount(String showCount) {
		this.showCount = showCount;
	}

}
