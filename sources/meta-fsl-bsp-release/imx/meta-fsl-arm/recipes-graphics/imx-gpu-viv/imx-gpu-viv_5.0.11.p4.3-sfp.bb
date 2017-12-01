# Copyright (C) 2013-2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-gpu-viv.inc

S="${WORKDIR}/${PN}-${PV}"

SRC_URI[md5sum] = "41f9d590c9a5b703571a3aedbe200bda"
SRC_URI[sha256sum] = "319eddd61b3513470befed306940fb751a52cc883ccf1445cad420ede00b09c5"

# FIXME skip the QA error for viv-samples
INSANE_SKIP_${PN} += "rpaths"

PACKAGE_FP_TYPE = "softfp"
