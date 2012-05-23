package com.allogy.build.maven;

import com.amazonaws.services.s3.model.CannedAccessControlList;
import org.apache.maven.wagon.repository.Repository;

public class S3Wagon extends org.kuali.maven.wagon.S3Wagon
{
	@Override
	protected CannedAccessControlList getAclFromRepository(Repository repository)
	{
		return CannedAccessControlList.Private;
	}
}
