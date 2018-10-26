package collection.set;

import com.google.gson.annotations.Expose;

/**
 * @author: liusha
 * @date:2018年9月14日
 * @time:下午2:53:01
 * @version: 1.0
 */
public class IndexNumberInfoDto{
	@Expose
	private String indexName;		//指标条数名称

	@Expose
	private String count;    		//条数
	
	

	public IndexNumberInfoDto(String indexName, String count) {
		super();
		this.indexName = indexName;
		this.count = count;
	}

	public String getIndexName() {
		return indexName;
	}

	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "IndexNumberInfoDto [indexName=" + indexName + ", count="
				+ count + "]";
	}

	@Override
	public int hashCode() {
		return indexName.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof IndexNumberInfoDto){
			return ((IndexNumberInfoDto) obj).getIndexName().equals(this.getIndexName());
		}
		return false;
	}

	


}
