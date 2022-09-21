package com.internal.objectrepository;

public class PGVPageObjects {
	public static final String PGV_TAB_PATH = "//span[contains(text(),'P/G/V')]";
	public static final String PGV_PGV_XPATH = "//div[@class='card']//span[contains(text(),'P/G/V')]";  
    public static final String GENE_NAME_ID = "geneName";
	public static final String VISIBILITY_PATH = "//div//div//div//div//div//div//div//div//div[1]//form[1]//div[1]//div[1]//input[1]";
	public static final String SAVE_ID = "btnSaveGene";
	public static final String GENE_POPUP_CLOSE_PATH = "//div[@class='modal-dialog vertical-align-center']//button[@class='close']";
	public static final String SNP_NAME_XPATH = "//div[@class='aura']//input[@id='snpName']";
	public static final String SNP_COMMENTS_XPATH ="//div[@class='aura']//textarea[@id='snpComments']";
	public static final String SNP_SHORTDES_XPATH = "//div[@class='aura']//textarea[@id='snpShortDescription']";
	public static final String SNP_VISIBILITY_XPATH = "//div[@class='aura']//input[@name='is_visible']";
	public static final String VARNAME_ONE_XPATH = "//div[@class='aura']//input[@id='variantName1']";
	public static final String VARQUAL_ONE_XPATH = "//div[@class='aura']//select[@id='variantQualifier1']";
	public static final String VARDESC_ONE_XPATH = "//div[@class='aura']//textarea[@id='variantDescription1']";
	public static final String SHORTCMT_ONE_XPATH = "//div[@class='aura']//textarea[@id='shortComment1']";
	public static final String VARNAME_TWO_XPATH = "//div[@class='aura']//input[@id='variantName2']";
	public static final String VARQUAL_TWO_XPATH = "//div[@class='aura']//select[@id='variantQualifier2']";
	public static final String VARDESC_TWO_XPATH = "//div[@class='aura']//textarea[@id='variantDescription2']";
	public static final String SHORTCMT_TWO_XPATH = "//div[@class='aura']//textarea[@id='shortComment2']";
	public static final String VARNAME_THREE_XPATH = "//div[@class='aura']//input[@id='variantName3']";
	public static final String VARQUAL_THREE_XPATH = "//div[@class='aura']//select[@id='variantQualifier3']";
	public static final String VARDESC_THREE_XPATH = "//div[@class='aura']//textarea[@id='variantDescription3']";
	public static final String SHORTCMT_THREE_XPATH = "//div[@class='aura']//textarea[@id='shortComment3']";
	public static final String SNP_SAVE_XPATH = "//input[@id='btnSaveSnpAndVariants']";
	public static final String VAR_POPUP_CLOSE_PATH = "//button[@class='close']//img[@class='img-responsive']  ";
    public static final String REFER_PATH_XPATH ="//textarea[@id='reference']";
	public static final String REFER_WEBLINK_XPATH ="//input[@id='weblink']";
	public static final String REFER_ORDER_XPATH = "//div[@id='referenceContainermini00']//input[@id='spinnerText']";
	public static final String REFER_SAVE_XPATH = "//input[@id='btnSaveReference']";
	
	//Category creation
	public static final String PGV_CATE_PATH = "//div[contains(text(),'Create Category')]";
	public static final String CATE_NAME_ID = "categoryName";
	public static final String CATE_IMAGE_ID = "categoryImage";
	public static final String CATE_ICON_ID = "categoryIcon";
	public static final String CATE_SORT_ID = "spinnerText";
	public static final String CATE_DESC_ID = "categoryDescription";
	public static final String CATE_SELECT_GENE_ID = "categoryGenes";
	public static final String CATE_SELECT_SNP_ID= "snp";
	public static final String CATE_VISIBILITY_XPATH = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/input[1]";
	public static final String CATE_SAVE_ID = "btnSaveCategory";
	
	
	//Product creation
	public static final String PGV_PRO_PATH = "//div[contains(text(),'Create Product')]";
	public static final String PRO_PREFIX_ID = "productPrefix";
	public static final String PRO_NAME_ID = "productName";
	public static final String PRO_SYNO_ID = "productSynonym";
	public static final String PRO_STORE_ID = "storeProductId";
	public static final String PRO_HERO_ID = "productHeroTitle";
	public static final String PRO_HERODES_ID = "productHeroDescriptor";
	public static final String PRO_ICON_ID = "productImage";
	public static final String PRO_DES_ID = "productDescription";
	public static final String PRO_SELECT_CATE_ID = "productCategories";
	public static final String PRO_VISIBILITY_XPATH = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/form[1]/div[1]/input[1]";
	public static final String PRO_SAVE_ID = "btnSaveProduct";
	
	
	//inapp Feature
	public static final String PGV_INAPP_PATH = "//div[@class='col-md-3 right-header-tab'] ";
	public static final String INAPP_PRO_ID = "inapp-products";
	public static final String INAPP_IMAGE_ID = "InAppImage";
	public static final String INAPP_URL_ID = "InAppUrl";
	public static final String INAPP_LABEL_ID = "InAppLabel";
	public static final String INAPP_SNP_SELECT_ID = "gene-select-id_51";
	public static final String INAPP_VISIBILITY_XPATH = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[4]/form[1]/div[1]/input[1]";
	public static final String INAPP_SAVE_ID = "btnSaveInApp";
	
	
	//pgv tab
	public static final String PGV_INSIDETAB_PATH ="//div[@class='card']//span[contains(text(),'P/G/V')]";

}
