/*
 * generated by Xtext 2.22.0
 */
package org.spf.packagexml.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.spf.packagexml.ide.contentassist.antlr.internal.InternalPackageXMLParser;
import org.spf.packagexml.services.PackageXMLGrammarAccess;

public class PackageXMLParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(PackageXMLGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, PackageXMLGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getTagAccess().getAlternatives(), "rule__Tag__Alternatives");
			builder.put(grammarAccess.getDescriptionTagAccess().getDescriptionTextAlternatives_4_0(), "rule__DescriptionTag__DescriptionTextAlternatives_4_0");
			builder.put(grammarAccess.getMaintainerTagAccess().getMaintainerTextAlternatives_6_0(), "rule__MaintainerTag__MaintainerTextAlternatives_6_0");
			builder.put(grammarAccess.getDependencyTagAccess().getAlternatives(), "rule__DependencyTag__Alternatives");
			builder.put(grammarAccess.getAuthorTagAccess().getAuthorTextAlternatives_5_0(), "rule__AuthorTag__AuthorTextAlternatives_5_0");
			builder.put(grammarAccess.getArbitraryTagAccess().getAlternatives_3(), "rule__ArbitraryTag__Alternatives_3");
			builder.put(grammarAccess.getArbitraryTagAccess().getInnerTextAlternatives_3_1_1_0(), "rule__ArbitraryTag__InnerTextAlternatives_3_1_1_0");
			builder.put(grammarAccess.getPackageAccess().getGroup(), "rule__Package__Group__0");
			builder.put(grammarAccess.getNameTagAccess().getGroup(), "rule__NameTag__Group__0");
			builder.put(grammarAccess.getVersionTagAccess().getGroup(), "rule__VersionTag__Group__0");
			builder.put(grammarAccess.getDescriptionTagAccess().getGroup(), "rule__DescriptionTag__Group__0");
			builder.put(grammarAccess.getMaintainerTagAccess().getGroup(), "rule__MaintainerTag__Group__0");
			builder.put(grammarAccess.getLicenseTagAccess().getGroup(), "rule__LicenseTag__Group__0");
			builder.put(grammarAccess.getRunDependencyTagAccess().getGroup(), "rule__RunDependencyTag__Group__0");
			builder.put(grammarAccess.getBuildDependDependencyTagAccess().getGroup(), "rule__BuildDependDependencyTag__Group__0");
			builder.put(grammarAccess.getExecDependDependencyTagAccess().getGroup(), "rule__ExecDependDependencyTag__Group__0");
			builder.put(grammarAccess.getBuildToolDependDependencyTagAccess().getGroup(), "rule__BuildToolDependDependencyTag__Group__0");
			builder.put(grammarAccess.getExportTagAccess().getGroup(), "rule__ExportTag__Group__0");
			builder.put(grammarAccess.getAuthorTagAccess().getGroup(), "rule__AuthorTag__Group__0");
			builder.put(grammarAccess.getAuthorTagAccess().getGroup_3(), "rule__AuthorTag__Group_3__0");
			builder.put(grammarAccess.getUrlTagAccess().getGroup(), "rule__UrlTag__Group__0");
			builder.put(grammarAccess.getArbitraryTagAccess().getGroup(), "rule__ArbitraryTag__Group__0");
			builder.put(grammarAccess.getArbitraryTagAccess().getGroup_3_0(), "rule__ArbitraryTag__Group_3_0__0");
			builder.put(grammarAccess.getArbitraryTagAccess().getGroup_3_1(), "rule__ArbitraryTag__Group_3_1__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
			builder.put(grammarAccess.getPackageAccess().getVersionAssignment_4(), "rule__Package__VersionAssignment_4");
			builder.put(grammarAccess.getPackageAccess().getFormatAssignment_10(), "rule__Package__FormatAssignment_10");
			builder.put(grammarAccess.getPackageAccess().getTagsAssignment_12(), "rule__Package__TagsAssignment_12");
			builder.put(grammarAccess.getNameTagAccess().getDeclaredPackageNameAssignment_3(), "rule__NameTag__DeclaredPackageNameAssignment_3");
			builder.put(grammarAccess.getDeclaredPackageNameAccess().getNameAssignment(), "rule__DeclaredPackageName__NameAssignment");
			builder.put(grammarAccess.getVersionTagAccess().getVersionAssignment_3(), "rule__VersionTag__VersionAssignment_3");
			builder.put(grammarAccess.getDescriptionTagAccess().getDescriptionTextAssignment_4(), "rule__DescriptionTag__DescriptionTextAssignment_4");
			builder.put(grammarAccess.getMaintainerTagAccess().getEmailAssignment_4(), "rule__MaintainerTag__EmailAssignment_4");
			builder.put(grammarAccess.getMaintainerTagAccess().getMaintainerTextAssignment_6(), "rule__MaintainerTag__MaintainerTextAssignment_6");
			builder.put(grammarAccess.getLicenseTagAccess().getLicenseAssignment_3(), "rule__LicenseTag__LicenseAssignment_3");
			builder.put(grammarAccess.getRunDependencyTagAccess().getNameAssignment_4(), "rule__RunDependencyTag__NameAssignment_4");
			builder.put(grammarAccess.getBuildDependDependencyTagAccess().getNameAssignment_4(), "rule__BuildDependDependencyTag__NameAssignment_4");
			builder.put(grammarAccess.getExecDependDependencyTagAccess().getNameAssignment_4(), "rule__ExecDependDependencyTag__NameAssignment_4");
			builder.put(grammarAccess.getBuildToolDependDependencyTagAccess().getNameAssignment_4(), "rule__BuildToolDependDependencyTag__NameAssignment_4");
			builder.put(grammarAccess.getExportTagAccess().getArbitrary_tagsAssignment_4(), "rule__ExportTag__Arbitrary_tagsAssignment_4");
			builder.put(grammarAccess.getAuthorTagAccess().getEmailAssignment_3_2(), "rule__AuthorTag__EmailAssignment_3_2");
			builder.put(grammarAccess.getAuthorTagAccess().getAuthorTextAssignment_5(), "rule__AuthorTag__AuthorTextAssignment_5");
			builder.put(grammarAccess.getUrlTagAccess().getTypeAssignment_4(), "rule__UrlTag__TypeAssignment_4");
			builder.put(grammarAccess.getUrlTagAccess().getUrlAssignment_6(), "rule__UrlTag__UrlAssignment_6");
			builder.put(grammarAccess.getArbitraryTagAccess().getNameAssignment_1(), "rule__ArbitraryTag__NameAssignment_1");
			builder.put(grammarAccess.getArbitraryTagAccess().getAttributesAssignment_2(), "rule__ArbitraryTag__AttributesAssignment_2");
			builder.put(grammarAccess.getArbitraryTagAccess().getInnerTextAssignment_3_1_1(), "rule__ArbitraryTag__InnerTextAssignment_3_1_1");
			builder.put(grammarAccess.getAttributeAccess().getKeyAssignment_0(), "rule__Attribute__KeyAssignment_0");
			builder.put(grammarAccess.getAttributeAccess().getValueAssignment_2(), "rule__Attribute__ValueAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private PackageXMLGrammarAccess grammarAccess;

	@Override
	protected InternalPackageXMLParser createParser() {
		InternalPackageXMLParser result = new InternalPackageXMLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS" };
	}

	public PackageXMLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PackageXMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}