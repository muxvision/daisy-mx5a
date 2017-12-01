FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

# add patches for 3.10.53-1.1.2  - apply only for i.MX 6SX 14x14
PATCH_SXLPDDR = " file://MLK-10374-imx-mx6sx-14x14-arm2-Change-dtb-file-name-.patch"
SRC_URI_append_imx6sx14x14arm2 = "${PATCH_SXLPDDR}"
